ipublic class Main {Add commentMore actions
    static String calc(String inpit){
        String[] tokens = inpit.split("");
        if (tokens.length !=3) {
            throw new
                    IllegalArgumentException("неверный формат ввода");
        }
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10){
            throw new
                    IllegalArgumentException("числа должны быть от 1 до 10");
        }

        int result;
        switch(tokens[1]){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result= a*b;
                break;
            case "/":
                if (b==0){
                    throw new
                            IllegalArgumentException("деление на ноль");

                }
                result=a/b;
                break;
            default:
                throw new
                        IllegalArgumentException("неверная операция" + tokens[1]);
        }

        return String.valueOf(result);
    }
}
