package chap04;

class Member {
    //회원정보
    private String name;
    private String id;
    private String password;
    private int age;

    //생성자
    public Member(String name,String id,String password,int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    //get = 접근자, set = 설정자
    public String getId() {
        return id;
    }

    public void setId() {
        this.id =id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;

    }
    public String getPasswd() {
        return password;
    }

    public void setPasswd() {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }
}

public class Three {
    public static void main(String[] args) {

    }
}
