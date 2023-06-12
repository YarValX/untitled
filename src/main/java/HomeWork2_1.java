public class HomeWork2_1 {
    public static void main(String[] args) throws Exception {
        String [] ListName =  lib.ReadLineFromFile("D:\\untitled\\src\\main\\java\\json.txt");
        for(int i = 0; i < ListName.length; i++) {
            System.out.println(PrintLine(ListName[i]));
        }
}
    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] arrayData = line5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < listName.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}