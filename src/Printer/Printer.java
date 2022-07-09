package Printer;

public class Printer {              //https://gist.github.com/mgumiero9/665ab5f0e5e7e46cb049c1544a00e29f Палитра
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_LIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_UNBOLD = "\u001B[21m";
    public static final String ANSI_UNDERLINE = "\u001B[4m";
    public static final String ANSI_STOP_UNDERLINE = "\u001B[24m";
    public static final String ANSI_BLINK = "\u001B[5m";

    public static void print() {
        System.out.println(ANSI_BLACK + "За горами гори, хмарою повиті," + ANSI_RESET);
        System.out.println(ANSI_RED + "Засіяні горем, кровію политі." + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Споконвіку Прометея" + ANSI_RESET);
        System.out.println(ANSI_LIGHT_YELLOW + "Там орел карає," + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Що день божий довбе ребра" + ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND + "Й серце розбиває." + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Розбиває, та не вип'є" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "Живущої крові, —" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Воно знову оживає" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "І сміється знову." + ANSI_RESET);
        System.out.println(ANSI_BOLD + "Не вмирає душа наша," + ANSI_RESET);
        System.out.println(ANSI_UNBOLD + "Не вмирає воля." + ANSI_RESET);
        System.out.println(ANSI_UNDERLINE + "І неситий не виоре" + ANSI_RESET);
        System.out.println(ANSI_STOP_UNDERLINE + "На дні моря поле." + ANSI_RESET);
        System.out.println(ANSI_BLINK + "Не скує душі живої" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "І слова живого." + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "Не понесе слави бога," + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Великого бога." + ANSI_RESET);
    }

    public static void main(String[] args) {
        print();
    }
}




