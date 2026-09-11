void  main() {
    Scanner keyboard = new Scanner(System.in);
    double PI = 3.141592;
    int radius; //문의 바저름
    double area;


    System.out.print("원의 반지를 입력 (정수형)");
    radius=keyboard.nextInt();

    area = 3.141592 * radius *radius;

    System.out.printf("원위 반지를 : %,d Cm, 면적 : %,.2f \u33A0\n", radius, area);


}
