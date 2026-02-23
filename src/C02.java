/**
 * 1. Node 클래스: 기차의 '객차' 하나를 의미함
 * 클래스 선언부: 데이터를 담는 바구니 역할을 정의함
 */
class Node {
    int data;      // 실제 저장할 숫자 (데이터)
    Node next;     // 다음 노드가 어디 있는지 가리키는 화살표 (참조)

    // 생성자: 새로운 노드를 만들 때 숫자를 바로 집어넣기 위해 사용함
    Node(int data) {
        this.data = data;
        this.next = null; // 처음 만들어진 노드는 연결된 다음 노드가 없으므로 null임
    }
}

/**
 * 2. MySimpleList 클래스: 기차 전체를 관리하는 '기차 역장'
 * 노드들을 연결하고, 출력하는 기능을 담당
 */
class MySimpleList {
    private Node head; // 기차의 가장 첫 번째 칸(머리)을 기억하는 변수

    // [데이터 추가 기능]
    public void add(int data) {
        Node newNode = new Node(data); // 1. 새로운 노드(기차 칸)를 생성

        // 2. 만약 기차가 텅 비어 있다면?
        if (head == null) {
            head = newNode; // 새 노드가 바로 첫 번째 칸(머리)이 됨
            return;
        }

        // 3. 기차에 칸이 있다면, 마지막 칸을 찾아야 함
        Node temp = head; // 머리부터 출발해서 찾아감

        // 다음 칸(next)이 없을 때까지(null이 아닐 때까지) 계속 이동
        // 이 과정은 기차 길이에 비례하므로 시간 복잡도는 O(n)
        while (temp.next != null) {
            temp = temp.next;
        }

        // 4. 드디어 찾은 마지막 칸의 '연결 고리(next)'에 새 노드를 연결
        temp.next = newNode;
    }

    // [전체 출력 기능]
    public void printList() {
        Node curr = head; // 현재 위치를 알려주는 '커서'를 머리에 둠

        // 더 이상 갈 곳이 없을 때까지 반복
        while (curr != null) {
            System.out.print(curr.data + " -> "); // 현재 칸의 데이터를 출력
            curr = curr.next; // 다음 칸으로 한 칸 이동
        }
        System.out.println("null (끝)"); // 기차의 끝임을 알림
    }
}

/**
 * 3. 메인 클래스 C02: 실제 프로그램이 시작되는 곳
 * 반드시 파일명과 동일해야 하며(C02.java), 실행 코드(명령어)는 main 메서드 안에 있어야 함
 */
public class C02 {
    // JVM이 가장 먼저 찾는 입구
    public static void main(String[] args) {
        // [중요] 모든 실행 명령어는 반드시 이 중괄호 { } 안에 있어야 함

        // 리스트 객체 생성
        MySimpleList myTrain = new MySimpleList();

        // 데이터 추가 (숫자 10, 20, 30을 순서대로 넣음)
        myTrain.add(10);
        myTrain.add(20);
        myTrain.add(30);

        // 결과 출력
        System.out.println("--- 3주차 연결 리스트 실행 결과 ---");
        myTrain.printList();
    }
}