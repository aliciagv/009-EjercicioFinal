package com.cice.logica;

import com.cice.modelo.Calculos;
import com.cice.vistas.Principal;
import javax.swing.JPanel;

/**
 *
 * @author Alicia
 */
public class Logica {

    private String numeroPantalla = "";
    private double primernumerando;
    private double segundonumerando;
  //  private boolean esPrimerNumeroPulsado;
    private boolean esNumeroIntroducido;
    private Principal vista;

    private int operacionSeleccionada;

    public Logica(Principal vista) {
        this.vista = vista;
    }

    public void analizarBotonPulsado(JPanel bottonPulsado) {
        //comprobará que botón ha sido pulsado para realizar una acción
        //esa acción será introducir o concatnar el número a la pantalla

        String botonaux = bottonPulsado.getName();
        // if numeroPantalla.equalsIgnoreCase("")&&(bot)
        numeroPantalla += botonaux;

        vista.txtPantalla.setText(numeroPantalla);

    }

    public void seleccionarCalculo(JPanel operacionpulsada) {
        //comporbará la operación solicitada y llamará al método de cálculo correspondiente
        String operacionaux = operacionpulsada.getName();
        switch (operacionaux) {
            case "sumar":
                this.operacionSeleccionada = 1;
                break;
            case "restar":
                this.operacionSeleccionada = 2;
                break;
            case "multiplicar":
                this.operacionSeleccionada = 3;
                break;
            case "dividir":
                this.operacionSeleccionada = 4;
                break;
        }
        System.out.println("El vlaor de operacion sellecionada es " + operacionSeleccionada);
        primernumerando = Double.parseDouble(numeroPantalla);
        esNumeroIntroducido = true;
        numeroPantalla = "";

    }

    public void calcular() {
        if (esNumeroIntroducido) {
            esNumeroIntroducido = false;
            this.segundonumerando = Double.parseDouble(numeroPantalla);
            String resultado = "";
            switch (operacionSeleccionada) {
                case 1:
                    resultado = Calculos.sumar(primernumerando, segundonumerando);
                    break;
                case 2:
                    resultado = Calculos.restar(primernumerando, segundonumerando);
                    break;
                case 3:
                    resultado = Calculos.multiplicar(primernumerando, segundonumerando);
                    break;
                case 4:
                    resultado = Calculos.dividir(primernumerando, segundonumerando);
                    break;

            }
            vista.txtPantalla.setText(resultado);
            numeroPantalla = "";
        }
    }

    public void limpiar() {
        numeroPantalla = "";
        vista.txtPantalla.setText(numeroPantalla);
        this.esNumeroIntroducido = false;
        this.primernumerando = 0;
        this.segundonumerando = 0;
        this.operacionSeleccionada=0;
    }

}
