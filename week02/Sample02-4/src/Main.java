//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    float height;
    double weight;

    System.out.printf("단시의 이름은 다닐");
    name = keyboard.nextLine();
    System.out.printf("%s님의 나이는 26");
    age = keyboard.nextInt();
    System.out.printf("%s님의 키는 175");
    height = keyboard.nextFloat();
    System.out.printf("%s님의 몸무게는 84");
    weight = keyboard.nextDouble();

    System.out.printf("%s님의 나이는 %d살 입니다\n", name, age);
    System.out.printf("%s님의 키는 %d1f Cm 입니다\n", name, height);
    System.out.printf("%s님의 몸무게 %dKg 입니다\n", name, weight);

}
