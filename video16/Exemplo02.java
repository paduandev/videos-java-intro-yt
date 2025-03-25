public class Exemplo02 {
    public static void main(String[] args) {
        int diaSemana = 7;
        String dia = "";

        if (diaSemana == 1) {
            dia = "Domingo";
        } else {
            if (diaSemana == 2) {
                dia = "Segunda";
            } else {
                if (diaSemana == 3) {
                    dia = "Terça";
                } else {
                    if (diaSemana == 4) {
                        dia = "Quarta";
                    } else {
                        if (diaSemana == 5) {
                            dia = "Quinta";
                        } else {
                            if (diaSemana == 6) {
                                dia = "Sexta";
                            } else {
                                if (diaSemana == 7) {
                                    dia = "Sábado";
                                } else {
                                    dia = "inválido";
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(dia);

        if (diaSemana == 1)
            dia = "Domingo";
        else if (diaSemana == 2)
            dia = "Segunda";
        else if (diaSemana == 3)
            dia = "Terça";
        else if (diaSemana == 4)
            dia = "Quarta";
        else if (diaSemana == 5)
            dia = "Quinta";
        else if (diaSemana == 6)
            dia = "Sexta";
        else if (diaSemana == 7)
            dia = "Sábado";
        else
            dia = "inválido";

        System.out.println(dia);


        dia = (diaSemana == 1) ? "Domingo"
                : (diaSemana == 2) ? "Segunda"
                        : (diaSemana == 3) ? "Terça"
                                : (diaSemana == 4) ? "Quarta"
                                        : (diaSemana == 5) ? "Quinta"
                                                : (diaSemana == 6) ? "Sexta" : (diaSemana == 7) ? "Sábado" : "inválido";

        System.out.println(dia);

        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;

            default:
                dia = "inválido";
        }

        System.out.println(dia);

        // switch expression
        dia = switch(diaSemana) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "inválido";
        };

        System.out.println(dia);
    }
}
