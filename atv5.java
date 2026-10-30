public class Conversor {

    public double converter(double temperatura) {

        if (temperatura != 0) {
            return (temperatura * 1.8) + 32;
        }
        else {
            return 32.0;
        }
    }

    public double converter(int distancia) {

        return distancia * 0.62137;
    }

    public String converter(String texto) {

        return texto.toUpperCase();
    }
};