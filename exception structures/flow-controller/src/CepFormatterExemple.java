public class CepFormatterExemple {
    public static void main(String[] args) {
        try {
            String cepFormatter = cepFormatter("23765064");
            System.out.println(cepFormatter);
        } catch (InvalidCepException e) {
            System.out.println("the cep is incorrect. It must has 8 numbers");
        }
    }

    public static String cepFormatter(String cep) throws InvalidCepException {
        if (cep.length() != 8) {
            throw new InvalidCepException();

            // Simulating a cep formatter  
            
        }
        return "23.765-064";
    }
}
