
class EduShop {

    public String buyPen(int cost) {
        if (cost == 10) {
            return "WoW! Successfully you got a pen 🖋";
        } else if (cost > 10) {
            int aliveCost = cost - 10;
            String result = "WoW! Successfully you got a pen 🖋" + " Your alive money " + aliveCost + "$";
            return result;
        } else if (cost < 10) {
            int needMoney = 10 - cost;
            String result = "If you want to buy a pen, give me another " + needMoney + "$ taka";
            return result;
        }
        return "Sorry something went wrong! Please try again later";
    }
}

public class Shop {

    public static void main(String[] args) {
        System.out.println("Welcome to the shop");

        EduShop eduObj = new EduShop();
        String result = eduObj.buyPen(20);
        System.out.println(result);
    }

}
