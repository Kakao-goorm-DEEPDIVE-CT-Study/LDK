/*
package Java_middle;

// 직원 클래스
class Employee {
    protected String name;
    protected double salary;

    // 생성자
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // 직원 정보를 출력
    public void displayInfo() {
        System.out.println("직원 이름: " + name);
        System.out.println("급여: " + salary);
    }
}

// 관리자 클래스
class Manager extends Employee {
    private String position;

    // 생성자
    public Manager(String name, double salary, String position) {
        super(name, salary);  // 부모 클래스(Employee)의 생성자 호출
        this.position = position;
    }

    // 오버라이딩된 정보 출력 메서드
    @Override
    public void displayInfo() {
        super.displayInfo();  // 부모 클래스의 displayInfo() 호출
        System.out.println("직책: " + position);
    }
}

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        // 직원 객체 생성
        Employee emp = new Employee("홍길동", 3000);
        emp.displayInfo();
        System.out.println();
        // 관리자 객체 생성
        Manager mgr = new Manager("김철수", 5000, "팀장");
        mgr.displayInfo();
    }
}
*/
