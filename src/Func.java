public class Func {
    public boolean tenet(String str) {
        Deque<Character> strDeq = new Deque<>();

        for (int i = 0; i < str.length(); i++) {
            strDeq.addTail(str.charAt(i));
        }

        while (strDeq.size() > 1) {
            if (!strDeq.removeFront().equals(strDeq.removeTail())) {
                return false;
            }
        }

        return true;
    }
}
