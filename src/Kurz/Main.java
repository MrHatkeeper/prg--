package Kurz;

public class Main {
    public static void main(String[] args) {

        String input = "Austrálie|dolar|1|AUD|15.719\n" +
                "Brazílie|real|1|BRL|4.076\n" +
                "Bulharsko|lev|1|BGN|12.993\n" +
                "Čína|žen-min-pi|1|CNY|3.353\n" +
                "Dánsko|koruna|1|DKK|3.417\n" +
                "EMU|euro|1|EUR|25.410\n" +
                "Filipíny|peso|100|PHP|42.634\n" +
                "Hongkong|dolar|1|HKD|2.785\n" +
                "Chorvatsko|kuna|1|HRK|3.390\n" +
                "Indie|rupie|100|INR|29.389\n" +
                "Indonesie|rupie|1000|IDR|1.521\n" +
                "Island|koruna|100|ISK|16.839\n" +
                "Izrael|nový šekel|1|ILS|6.776\n" +
                "Japonsko|jen|100|JPY|19.621\n" +
                "Jižní Afrika|rand|1|ZAR|1.448\n" +
                "Kanada|dolar|1|CAD|17.064\n" +
                "Korejská republika|won|100|KRW|1.838\n" +
                "Maďarsko|forint|100|HUF|7.118\n" +
                "Malajsie|ringgit|1|MYR|5.177\n" +
                "Mexiko|peso|1|MXN|1.075\n" +
                "MMF|ZPČ|1|XDR|30.768\n" +
                "Norsko|koruna|1|NOK|2.518\n" +
                "Nový Zéland|dolar|1|NZD|15.228\n" +
                "Polsko|zlotý|1|PLN|5.518\n" +
                "Rumunsko|leu|1|RON|5.133\n" +
                "Rusko|rubl|100|RUB|29.715\n" +
                "Singapur|dolar|1|SGD|16.017\n" +
                "Švédsko|koruna|1|SEK|2.506\n" +
                "Švýcarsko|frank|1|CHF|23.459\n" +
                "Thajsko|baht|100|THB|64.821\n" +
                "Turecko|lira|1|TRY|2.453\n" +
                "USA|dolar|1|USD|21.683\n" +
                "Velká Británie|libra|1|GBP|29.649";




        String lines[] = input.split("\n");


        for(int i = 0; i < lines.length;i++){
            String data[] = lines[i].split("\\|");

            double output = 1.0 / Float.parseFloat(data[4]);
            System.out.println(output + " " + data[3] + " = 1 CZK");
        }
    }
}
