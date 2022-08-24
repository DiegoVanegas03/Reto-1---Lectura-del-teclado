import javax.swing.JOptionPane;

class SUMA {
    public static void main( String args[] ) {

        String Operacion =  JOptionPane.showInputDialog(
                null,"Captura Operacion:",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE );

        if((Operacion.compareTo("SUMA") == 0) || (Operacion.compareTo("RESTA") == 0) || (Operacion.compareTo("MULTIPLICACION") == 0) || (Operacion.compareTo("DIVISION") == 0))
        {
            int numero1 = Integer.parseInt( JOptionPane.showInputDialog(
                    null,"Operando 1",
                    "Calculadora",
                    JOptionPane.QUESTION_MESSAGE) );

            int numero2 = Integer.parseInt( JOptionPane.showInputDialog(
                    null,"Operando 2",
                    "Calculadora",
                    JOptionPane.QUESTION_MESSAGE) );
            int resultado = 0;
            switch (Operacion)
            {
                case "SUMA"-> resultado = numero1 + numero2;

                case "RESTA"-> resultado = numero1 - numero2;

                case "MULTIPLICACION"-> resultado = numero1 * numero2;

                case "DIVISION"-> resultado = numero1 / numero2;
            }
            JOptionPane.showMessageDialog(
                    null,"EL resultado de la " + Operacion + " : " + resultado,
                    "Sumador",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(
                    null,"Operacion no Soportada",
                    "Sumador",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

