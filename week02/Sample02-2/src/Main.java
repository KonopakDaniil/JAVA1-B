void main() {
    Scanner keyboard = new Scanner(System.in);
    String name ="다닐";
    int age =0;

    System.out.print("당신의 이름은 다닐");
    name = keyboard.nextLine();
    System.out.printf("%s님 나이는 26", name);
    age = keyboard.nextInt();

    name = "다닐";

    System.out.printf("이름 : %s, 나이 : %d 살\n", name, age);

}