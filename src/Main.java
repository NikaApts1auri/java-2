import static java.util.stream.Collectors.toList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {

//int [] score={12,47,52,54};
//    System.out.println("test "+score[0]);
//
//
//  double[] prices={10.5,20.0,15.75,40.2};
//    System.out.println(prices[prices.length-1]);


//    int [] score={12,47,52,54};
//    score[1]=99;
//    System.out.println(score[1]);


// String[] fruits={"ვაშლი","მსხალი","ატამი"}   ;
//         fruits[1]="ალუბალი";
//    System.out.println(fruits[1]);


//  int[][]miniMatrix={
//          {10, 20},
//          {30,40}
//  };
//    System.out.println(miniMatrix[1][0]);


//    String test1="Hello";
//    String test2="World";
//    System.out.println(test1.concat(test2) );

//5
//    String course ="Web development";
//
//    System.out.println(course.substring(3,15));


//6
//    String word="java";
//    System.out.println("6-დიდი ასოებით"+word.toUpperCase());


    //7

//    StringBuilder sb1= new StringBuilder("giorgi");
//            sb1.append("beridze");
//
//
//    System.out.println(sb1);

//8


//    if(!word1.equals(word1.reverse())){
//        System.out.println("this word isnot palindrom");
//    }else {
//        System.out.println("this word is palindrom");
//    }


//    StringBuilder word1= new StringBuilder("radar");
//
//    boolean isPalindrome = true;
//
//    for (int i = 0; i < word1.length(); i++) {
//
//        for (int j = word1.length() - 1; j >= 0; j--) {
//
//            if (i + j == word1.length() - 1) {
//
//                if (word1.charAt(i) != word1.charAt(j)) {
//                    isPalindrome = false;
//                    break;
//                }
//            }
//        }
//    }
//
//    if (isPalindrome) {
//        System.out.println("palindrome");
//    } else {
//        System.out.println("not palindrome");
//    }

//1
//    int[] grades={45,88,92,30,67,100,51};
//
//    int firstStud=grades[0];
//    int lastStud=grades[grades.length-1];
//    int sum=firstStud+lastStud;
//    if(sum>=100){
//        System.out.println("Succes group");
//    }else {
//        System.out.println("You need development skill ");
//    }
//   if(sum/2==0){
//       System.out.println("Sum is luwi");
//   }else {
//       System.out.println("Sum is kenti");
//   }
//

    //2
//    String text = "java programing";
//
//    StringBuilder text2 = new StringBuilder(text);
//
//    text2.insert(0, "Welcome to ");
//    text2.append("!");
//
//    System.out.println(text2);


// the best practice with loop to do palindrom

//    String word="radar";
//    for(int i=0;i<word.length();i++){
//        if(word.charAt(i)!=word.charAt(word.length()-1-i)){
//            System.out.println("isnot palindrom");
//            break;
//        }else {
//            System.out.println("is palindrom");
//            break;
//        }
//    }
//
//ამოცანა1: Stream-ის გამოყენებით მიიღე მხოლოდ 10-ზე მეტი რიცხვები.
//    List<Integer>numbers=List.of(12, 5, 8, 21, 30, 7, 16, 3);
//    List<Integer> result=numbers.stream().filter(n-> n>10).toList();
//    System.out.println(result);


    //2   მიიღე მხოლოდ ლუწი რიცხვები და შემდეგ თითოეული გაამრავლე 3-ზე.
//    List<Integer> numbers = List.of(2, 5, 8, 11, 14, 17);
//    List<Integer>result=numbers.stream().filter(n->n%2==0).map(n->n*3).toList();
//    System.out.println(result);

    //2 ყველა სახელი გადაიყვანე uppercase-ში.

//    List<String> names=List.of("nika", "giorgi", "ana", "luka");
//    List<String>result=names.stream().map(n->n.toUpperCase()).toList();
//    System.out.println(result);


    //3 იპოვე მხოლოდ ის სახელები, რომელთა სიგრძეა 4-ზე მეტი და გადაიყვანე uppercase-ში.
//    List<String> names = List.of(
//            "Nika",
//            "Giorgi",
//            "Ana",
//            "Alexander",
//            "Luka",
//            "Mari"
//    );
//    List<String> result=names.stream().filter(n->n.length()>4).
//                                       map(n->n.toUpperCase()).
//                                       toList();
//    System.out.println(result);


    //4 დაალაგე ზრდადობით Stream-ის გამოყენებით.
//    List<Integer>numbers=List.of(45, 12, 89, 3, 27, 18);
//    System.out.println(numbers.stream().sorted().toList());//
//    List<Integer>result=numbers.stream().sorted().toList();
//    System.out.println("result: "+result);


//5  მოაშორე დუბლიკატები.

//    List<Integer> numbers=List.of(15, 2, 5, 8, 2, 10, 8, 15, 10);
//    List<Integer> result = numbers.stream().distinct().toList();
//    System.out.println(result);


//6 გამოტოვე პირველი 2 სახელი და აიღე შემდეგი 3.

//    List<String> names = List.of(
//            "Nika",
//            "Giorgi",
//            "Ana",
//            "Luka",
//            "Mari",
//            "Dato",
//            "Saba");
//    List<String> result = names.stream().skip(2).limit(3).toList();
//    System.out.println(result);

    //7 იპოვე პირველი რიცხვი, რომელიც 10-ზე მეტია.

//    List<Integer> numbers = List.of(3, 7,20, 12, 18, 25, 30,40);
//    Integer result = numbers.stream().filter(n -> n % 10 == 0).findFirst().orElse(null);
//
//    System.out.println(result);


//შეამოწმე:8
//
//არსებობს თუ არა 30?
//ყველა რიცხვი დადებითია?
//არცერთი რიცხვი არ არის 100?

//    List<Integer> numbers = List.of(10, 20, 30, 40, 50);
//    boolean existi30=numbers.stream().anyMatch(n->n==30);
//    System.out.println(existi30);


//    boolean allPositive = numbers.stream().allMatch(n->n>=0);
//    System.out.println(allPositive);

//    boolean dontExist100 = numbers.stream().noneMatch(n -> n == 100);
//    System.out.println(dontExist100);


//9 Stream-ის reduce() გამოყენებით დაითვალე ყველა რიცხვის ჯამი
//    List<Integer> numbers = List.of(55, 10, 15, 20);
//  int result=numbers.stream().reduce(0,(sum,n)->sum+n);
//    System.out.println(result);


    //1 მიიღე მხოლოდ ის რიცხვები, რომლებიც 10-ზე მეტია.
//    List<Integer> numbers = List.of(12, 5, 8, 21, 30, 7, 16, 3);
//    List<Integer> result = numbers.stream().filter(n -> n > 10).toList();
//    System.out.println(result);


    //2 მიიღე ლუწი რიცხვები და თითოეული გაამრავლე 3-ზე.
//    List<Integer> numbers = List.of(2, 5, 8, 11, 14, 17, 20);
//    List<Integer> result = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 3).toList();
//    System.out.println(result);

    //3 მიიღე მხოლოდ ის სახელები, რომელთა სიგრძე 4-ზე მეტია.
//    List<String> names = List.of(
//            "Nika", "Giorgi", "Ana", "Alexander", "Luka", "Mari"
//    );
//    List<String> result = names.stream().filter(n->n.length()>4).toList();
//    System.out.println(result);


    //4  მიიღე ყველა სახელი დიდი ასოებით.

//    List<String> names = List.of(
//            "nika", "giorgi", "ana", "luka", "mari"
//    );
//    List<String> result=names.stream().map(n->n.toUpperCase()).toList();
//    System.out.println(result);

    //5 მიიღე მხოლოდ უნიკალური რიცხვები.
//    List<Integer> numbers = List.of(
//            5, 2, 5, 8, 2, 10, 8, 15, 10, 20
//    );
//    List<Integer> result = numbers.stream().distinct().toList();
//    System.out.println(result);

    //6 დაალაგე რიცხვები ზრდადობით.
//    List<Integer> numbers = List.of(
//            45, 12, 89, 3, 27, 18, 56, 9
//    );
//    List<Integer> result =numbers.stream().sorted().toList();
//    System.out.println(result);


//7 მიიღე მესამე ელემენტიდან მეხუთე ელემენტამდე.
//    List<String> names = List.of(
//            "Nika", "Giorgi", "Ana", "Luka", "Mari", "Dato", "Saba"
//    );
//    List<String> result = names.stream().skip(3).limit(2).toList();
//    System.out.println(result);


//იპოვე პირველი რიცხვი, რომელიც 10-ზე მეტია.

//    List<Integer> numbers = List.of(
//            1,3, 7, 12, 18, 25, 30
//    );
//    int result=numbers.stream().filter(n->n>10).findFirst().orElse(null);
//    System.out.println(result);


    //9 შეამოწმე, არსებობს თუ არა 30.
//    List<Integer> numbers = List.of(
//            10, 20, 30, 40, 50
//    );
//    boolean result=numbers.stream().anyMatch(n->n==30);
//    System.out.println(result);


//10 შეამოწმე, არის თუ არა ყველა რიცხვი დადებითი.

//    List<Integer> numbers = List.of(
//            10, 20, 30, 40, 50
//    );
//
//    boolean result = numbers.stream().allMatch(n -> n > 0);
//    System.out.println(result);


//11 მიიღე ყველა რიცხვის ჯამი.

//    List<Integer> numbers = List.of(
//            15, 10, 15, 20, 25
//    );
//    int result = numbers.stream().reduce(0, (sum, n) -> sum += n);
//    System.out.println(result);


    //12მიიღე ყველა რიცხვის ნამრავლი.

//    List<Integer> numbers = List.of(
//            2, 3, 4, 5
//    );
//
//    int result = numbers.stream().reduce(1,(sum, n) -> sum *= n);
//    System.out.println(result);


    //13 იპოვე ყველაზე გრძელი სიტყვა.
//    List<String> words = List.of(
//            "Java", "Spring", "Boot", "Backend", "API"
//    );
//    String longWord = words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).orElse(null);
//    System.out.println(longWord);

    //14 იპოვე ყველაზე დიდი და ყველაზე პატარა რიცხვი.
//    List<Integer> numbers = List.of(
//            12, 45, 7, 89, 23, 56, 91, 4
//    );
//    int biggest = numbers.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2).orElse(null);
//    int smallest = numbers.stream().reduce((num1, num2) -> num1 < num2 ? num1 : num2).orElse(null);
//    System.out.println("The biggest is : "+biggest+ " The smallest is "+smallest);

//15 მიიღე რიცხვები, რომლებიც 10-ზე მეტია, გაამრავლე 2-ზე, დაალაგე კლებადობით და დატოვე მხოლოდ პირველი 3.
//    List<Integer> numbers = List.of(
//            12, 5, 8, 21, 44, 17, 30, 9, 52, 14
//    );
//
//    List<Integer> result = numbers.stream().filter(n -> n > 10)
//                                           .map(n -> n * 2)
//                                           .sorted(Comparator.reverseOrder())
//                                           .limit(3)
//                                           .toList();
//    System.out.println(result);


//16 მიიღე სიტყვები, რომელთა სიგრძე 4-ზე მეტია, გადაიყვანე uppercase-ში და დაალაგე სიგრძის მიხედვით.
//    List<String> words = List.of(
//            "java", "spring", "backend", "api",
//            "database", "docker", "git"
//    );
//
//    List<String> result = words.stream().filter(word -> word.length() > 4)
//                                        .map(w -> w.toUpperCase())
//                                        .sorted(Comparator.comparing(String::length))//ალაგებს სიგრძის მიხედვით
//                                        .toList();
//    System.out.println(result);


    //17 მიიღე მხოლოდ 20-ზე მეტი ლუწი რიცხვები და გამოთვალე მათი ჯამი.
//    List<Integer> numbers = List.of(
//            10, 15, 20, 25, 30, 35, 40, 45
//    );
//    int result=numbers.stream().filter(n->n>20).reduce(0,(sum,num)->sum+=num);
//    System.out.println(result);


//
//    19. მიიღე მხოლოდ Electronics კატეგორიის პროდუქტები.
//
//    20. მიიღე მხოლოდ პროდუქტები, რომელთა ფასი 500-ზე მეტია.
//
//    21. მიიღე ყველა პროდუქტის სახელი.
//
//    22. მიიღე Electronics პროდუქტების სახელები, რომლებიც 1000-ზე ძვირია.
//
//    23. იპოვე ყველაზე ძვირი პროდუქტი.
//
//    24. იპოვე ყველაზე იაფი პროდუქტი.
//
//    25. გამოთვალე ყველა პროდუქტის ფასების ჯამი.
//
//    26. დათვალე რამდენი პროდუქტია Electronics კატეგორიაში.
//
//    27. მიიღე ყველა პროდუქტი ფასის მიხედვით კლებადობით.
//
//    28. მიიღე Electronics პროდუქტები, დაალაგე ფასის მიხედვით ზრდადობით და დაბეჭდე მხოლოდ მათი სახელები.

//    29 მიიღე Electronics კატეგორიის პროდუქტები, რომელთა ფასი 100-ზე მეტია, და საბოლოოდ მიიღე მხოლოდ მათი სახელები ფასის კლებადობით.
//    30.იგივე products-იდან იპოვე ყველა Education პროდუქტის ფასების ჯამი.
//
//    31 იგივე products-იდან შეამოწმე, არსებობს თუ არა პროდუქტი, რომლის ფასიც 2000-ზე მეტია.
//
//    32.იგივე products-იდან მიიღე უნიკალური კატეგორიების სია.
    List<Product> products = List.of(
            new Product("Laptop", 2500, "Electronics"),
            new Product("Phone", 1800, "Electronics"),
            new Product("Book", 30, "Education"),
            new Product("Mouse", 80, "Electronics"),
            new Product("Keyboard", 150, "Electronics"),
            new Product("Java Course", 300, "Education"),
            new Product("Monitor", 900, "Electronics")

    );



//    getElectronics(products);
//    getProductPriceAbove500(products);
//    getAllProductName(products);
//    getAllProductNameAbove1000(products);
//    mostExpensiveProduct(products);
//    mostCheapestProduct(products);
//    sumPrices(products);
//    quantityOfElectronic(products);
//    priceByDecres(products);
//    electrProdNames(products);
//    electrAbove100ProdNames(products);
//    sumOfEducations(products);
//    existProdByPriceAbove2000(products);
    uniqueCategories(products);
}//main
     //19. მიიღე მხოლოდ Electronics კატეგორიის პროდუქტები.
        public static void getElectronics(List<Product> products) {
            List<Product> result = products.stream()
                    .filter(n -> n.getCategory().equals("Electronics"))
                    .toList();

            for (Product p : result) {
                System.out.println(p.getName());
            }
        }

     //20. მიიღე მხოლოდ პროდუქტები, რომელთა ფასი 500-ზე მეტია.
      public  static  void getProductPriceAbove500(List<Product> products){
          List<Product> result=products.stream().filter(n->n.getPrice()>500).toList();
                  for(Product p:result){
                      System.out.println(p.getName());
                  }
      }


     //21. მიიღე ყველა პროდუქტის სახელი.
      public  static void getAllProductName(List<Product> products){
        List<String>productNames=products.stream().map(p->p.getName()).toList();
        for(String name:productNames){
            System.out.println(name);
        }
      }


      // 22. მიიღე Electronics პროდუქტების სახელები, რომლებიც 1000-ზე ძვირია.
      public  static void getAllProductNameAbove1000(List<Product> products){
          List<String>productNames=products.stream().filter(p->p.getPrice()>1000).map(p->p.getName()).toList();
          for(String name:productNames){
              System.out.println(name);
          }
      }


      //23. იპოვე ყველაზე ძვირი პროდუქტი.
    public static void mostExpensiveProduct(List<Product> products){
    Product result=products.stream().reduce((prod1,prod2)->prod1.getPrice()>prod2.getPrice()?prod1:prod2).orElse(null);
        if (result != null) {
            System.out.println(result.getName() + " - " + result.getPrice());
        }
    }

    //24. იპოვე ყველაზე იაფი პროდუქტი.
    public static void mostCheapestProduct(List<Product> products){
        Product result=products.stream().reduce((prod1,prod2)->prod1.getPrice()<prod2.getPrice()?prod1:prod2).orElse(null);
        if (result != null) {
            System.out.println(result.getName() + " - " + result.getPrice());
        }
    }



    //25. გამოთვალე ყველა პროდუქტის ფასების ჯამი.
  public static void sumPrices(List<Product> products){
//      int sum = products.stream().map(p -> p.getPrice()).reduce((sum, num) -> sum += num).orElse(null);
      double result = products.stream().map(p -> p.getPrice()).reduce(0.0 ,(sum, price) -> sum + price);
      System.out.println(result);
  }



  //26. დათვალე რამდენი პროდუქტია Electronics კატეგორიაში.
        public static void quantityOfElectronic(List<Product> products){
        long result=products.stream().filter(p->p.getCategory().equals("Electronics")).count();//count return long types answer and ..
            System.out.println(result);

        }


 //27. მიიღე ყველა პროდუქტი ფასის მიხედვით კლებადობით.
 public static void priceByDecres(List<Product> products){
   List<Product> result=products.stream().sorted(Comparator.comparing(p -> p.getPrice(), Comparator.reverseOrder())).toList();
      for(Product prod:result){
          System.out.println(prod.getName()+  " --  "+ prod.getPrice());
      }

 }



 //// 28. მიიღე Electronics პროდუქტები, დაალაგე ფასის მიხედვით ზრდადობით და დაბეჭდე მხოლოდ მათი სახელები.
 public static void electrProdNames(List<Product> products){
     List<String> result=products.stream().sorted(Comparator.comparing(p -> p.getPrice())).map(p->p.getName()).toList();
     System.out.println(result);

 }

 //   29 მიიღე Electronics კატეგორიის პროდუქტები, რომელთა ფასი 100-ზე მეტია, და საბოლოოდ მიიღე მხოლოდ მათი სახელები ფასის კლებადობით.
 public static void electrAbove100ProdNames(List<Product> products){
     List<String>result=products.stream().filter(p->p.getCategory()
                                         .equals("Electronics")&&p.getPrice()>100)
                                         .sorted(Comparator.comparing(p->p.getPrice(),Comparator.reverseOrder()))
                                         .map(p->p.getName()).toList();

     System.out.println(result);

 }



 //30.იგივე products-იდან იპოვე ყველა Education პროდუქტის ფასების ჯამი.
 public static void sumOfEducations(List<Product> products){
     double result = products.stream().filter(p -> p.getCategory().equals("Education")).map(p -> p.getPrice()).reduce((sum, num) -> sum += num).orElse(null);
     System.out.println(result);


 }


 // 31 იგივე products-იდან შეამოწმე, არსებობს თუ არა პროდუქტი, რომლის ფასიც 2000-ზე მეტია.
public static  void existProdByPriceAbove2000(List<Product> products){
    boolean result = products.stream().anyMatch(p -> p.getPrice() > 2000);
    System.out.println(result);
}



//32.იგივე products-იდან მიიღე უნიკალური კატეგორიების სია.
public static  void uniqueCategories(List<Product> products){
     List<String> result=products.stream().map(p->p.getCategory()).distinct().toList();/// :))
     for(String sia:result){
         System.out.println(sia);
     }
}



        class Product {

            private String name;
            private double price;
            private String category;

            public Product(String name, double price, String category) {
                this.name = name;
                this.price = price;
                this.category = category;
            }

            public String getName() {
                return name;
            }

            public double getPrice() {
                return price;
            }

            public String getCategory() {
                return category;
            }
        }









