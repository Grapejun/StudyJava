abstract class pariMap {
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class dictionary extends pariMap{
    private int count;
    public dictionary(int num) {
        keyArray = new String[num];
        valueArray = new String[num];
        count = 0;
    }
    @Override
    public String get(String key) {
        for (int i = 0; i < keyArray.length; i++) {
            if (key.equals(keyArray[i]))
                return valueArray[i];
        }
        return null;
    }
    @Override
    public void put(String key, String value) {

        for (int i = 0; i < keyArray.length; i++)
        {
            if(key.equals(keyArray[i])) {
                valueArray[i] = value;
                return;
            }
        }
        keyArray[count] = key;
        valueArray[count] = value;
        count++;
    }
    @Override
    public String delete(String key) {
        for (int i = 0; i < keyArray.length; i++)
        {
            if(key.equals(keyArray[i])) // keyArray[i].equals(key)안됨. key.equals(keyArray[i]) 됨. 전자로 하면 널포인터 오류남 씨발. 널포인터는 값으로만 들어갈 수 있다.
            {
                keyArray[i] = null;
                String temp = valueArray[i];
                valueArray[i] = null;
                return temp;
            }
        }
        return null;
    }
    @Override
    public int length() {
        return count;

    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        dictionary dic = new dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
