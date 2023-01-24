package logical_sat;
import java.util.*;
public class Directions_2Q {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("                  Lets start your walk...........");
        System.out.println("to go south enter: 1 ");
        System.out.println("to go north enter: 2 ");
        System.out.println("to go east enter: 3 ");
        System.out.println("to go west enter: 4 ");
        int choice = scan.nextInt();
        switch (choice)
        {
            //main case 1
            case 1: {
                System.out.println("enter distance u want to travel :");
                double travel1 = scan.nextDouble();
                System.out.println("enter 1 to take left");
                System.out.println("enter 2 to take right");
                int turnChoice1 = scan.nextInt();
                switch (turnChoice1) {
                    case 1: {
                        System.out.println("enter distance u want to travel");
                        double travel2 = scan.nextDouble();
                        System.out.println("enter 1 to take left");
                        System.out.println("enter 2 to take right");
                        int turnChoice2 = scan.nextInt();
                        switch (turnChoice2) {
                            case 1: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totaltravelFirst = travel1 + travel2 + travel3;
                                //h
                                if (travel3 < travel1 ) {
                                    System.out.println("You have travelled " + totaltravelFirst + " km towords South-East");
                                } else if (travel3 == travel1) {
                                    System.out.println("You have travelled :" + totaltravelFirst + " km towords East");
                                } else {
                                    System.out.println("You have travelled " + totaltravelFirst + " km towords North-East");
                                }
                            }
                            break;
                            case 2: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totaltravelFirstRight = travel1 + travel2 + travel3;
                                //h
                                if (travel3 < travel1 && turnChoice2==2) {
                                    System.out.println("You have travelled " + totaltravelFirstRight + " km towords South-East");
                                }
                                else if (turnChoice1==1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totaltravelFirstRight + " km towords South-East");
                                }
                                else if (travel3 == travel1 && turnChoice2==1) {
                                    System.out.println("You have travelled :" + totaltravelFirstRight + " km towords East");
                                }
                                else {
                                    System.out.println("You have travelled " + totaltravelFirstRight + " km towords North-East");
                                }
                                break;
                            }

                            default: {
                                System.out.println("You have entered wrong input.Please come from start");
                            }
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("enter distance u want to travel");
                        double travel2 = scan.nextDouble();
                        System.out.println("enter 1 to take left");
                        System.out.println("enter 2 to take right");
                        int turnChoice2 = scan.nextInt();
                        switch (turnChoice2) {
                            case 1: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totalTravel = travel2 + travel2 + travel3;
                                if (travel3 < travel1) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South-west");
                                } else if (travel3 == travel1 && travel3==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords West");
                                } else {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-west");
                                }
                            }
                            case 2: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totalTravel = travel2 + travel2 + travel3;
                                if (travel3 < travel1) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South-west");
                                } else if (travel3 == travel1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords West");
                                } else {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-west");

                                }
                                break;

                            }//..
                            default: {
                                System.out.println("You have entered wrong input.please come from first");
                            }
                        }
                        break;

                    }
                    default: {
                        System.out.println("You have entered wrong input.please come from first");
                    }
                }
            }

                //main case 2

            case 2: {
                System.out.println("enter distance u want to travel :");
                double travel1 = scan.nextDouble();
                System.out.println("enter 1 to take left");
                System.out.println("enter 2 to take right");
                int turnChoice1 = scan.nextInt();
                switch (turnChoice1) {
                    case 1: {
                        System.out.println("enter distance u want to travel");
                        double travel2 = scan.nextDouble();
                        System.out.println("enter 1 to take left");
                        System.out.println("enter 2 to take right");
                        int turnChoice2 = scan.nextInt();
                        switch (turnChoice2) {
                            case 1: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totaltravelFirst = travel1 + travel2 + travel3;
                                //h
                                if (travel3 < travel1 ) {
                                    System.out.println("You have travelled " + totaltravelFirst + " km towords North_West");
                                } else if (travel3 == travel1) {
                                    System.out.println("You have travelled :" + totaltravelFirst + " km towords West");
                                } else {
                                    System.out.println("You have travelled " + totaltravelFirst + " km towords South-West");
                                }
                            }
                            break;
                            case 2: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totaltravelFirstRight = travel1 + travel2 + travel3;
                                //h
                                if (travel3 < travel1 && turnChoice2==2) {
                                    System.out.println("You have travelled " + totaltravelFirstRight + " km towords North-West");
                                }
                                else if (turnChoice1==1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totaltravelFirstRight + " km towords North-west");
                                }
                                else if (travel3 == travel1 && turnChoice2==1) {
                                    System.out.println("You have travelled :" + totaltravelFirstRight + " km towords West");
                                }
                                else {
                                    System.out.println("You have travelled " + totaltravelFirstRight + " km towords North-East");
                                }
                                break;
                            }

                            default: {
                                System.out.println("You have entered wrong input.Please come from start");
                            }
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("enter distance u want to travel");
                        double travel2 = scan.nextDouble();
                        System.out.println("enter 1 to take left");
                        System.out.println("enter 2 to take right");
                        int turnChoice2 = scan.nextInt();
                        switch (turnChoice2) {
                            case 1: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totalTravel = travel2 + travel2 + travel3;
                                if (travel3 < travel1) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-East");
                                }
                                else if (travel3 == travel1 && turnChoice2==2)
                                {
                                    System.out.println("You have travelled :" + totalTravel + " km towords East");
                                }
                                else if (travel3>travel1 && turnChoice2==1)
                                {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-East");
                                }
                                else {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South_East");
                                }
                            }
                            case 2: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totalTravel = travel2 + travel2 + travel3;
                                if (travel3 < travel1) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-East");
                                } else if (travel3 == travel1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords East");
                                } else {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South-East");

                                }
                                break;

                            }//..
                            default: {
                                System.out.println("You have entered wrong input.please come from first");
                            }
                        }
                        break;

                    }
                    default: {
                        System.out.println("You have entered wrong input.please come from first");
                    }
                }
            }

                //main case 3

            case 3: {
                System.out.println("enter distance u want to travel :");
                double travel1 = scan.nextDouble();
                System.out.println("enter 1 to take left");
                System.out.println("enter 2 to take right");
                int turnChoice1 = scan.nextInt();
                switch (turnChoice1) {
                    case 1: {
                        System.out.println("enter distance u want to travel");
                        double travel2 = scan.nextDouble();
                        System.out.println("enter 1 to take left");
                        System.out.println("enter 2 to take right");
                        int turnChoice2 = scan.nextInt();
                        switch (turnChoice2) {
                            case 1: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totaltravelFirst = travel1 + travel2 + travel3;
                                //h
                                if (travel3 < travel1 ) {
                                    System.out.println("You have travelled " + totaltravelFirst + " km towords North-East");
                                }
                                else if (travel3 == travel1 && turnChoice2==1)
                                {
                                    System.out.println("You have travelled :" + totaltravelFirst + " km towords North");
                                }
                                else if (turnChoice1==1 && turnChoice2==1 && travel3>travel1)
                                {
                                    System.out.println("You have travelled :" + totaltravelFirst + " km towords North-West");
                                }
                                else {
                                    System.out.println("You have travelled " + totaltravelFirst + " km towords North-East");
                                }
                            }
                            break;
                            case 2: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totaltravelFirstRight = travel1 + travel2 + travel3;
                                //h
                                if (travel3 < travel1 && turnChoice2==2) {
                                    System.out.println("You have travelled " + totaltravelFirstRight + " km towords South-East");
                                }
                                else if (turnChoice1==1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totaltravelFirstRight + " km towords South-East");
                                }
                                else if (travel3 == travel1 && turnChoice2==1) {
                                    System.out.println("You have travelled :" + totaltravelFirstRight + " km towords East");
                                }
                                else {
                                    System.out.println("You have travelled " + totaltravelFirstRight + " km towords North-East");
                                }
                                break;
                            }

                            default: {
                                System.out.println("You have entered wrong input.Please come from start");
                            }
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("enter distance u want to travel");
                        double travel2 = scan.nextDouble();
                        System.out.println("enter 1 to take left");
                        System.out.println("enter 2 to take right");
                        int turnChoice2 = scan.nextInt();
                        switch (turnChoice2) {
                            case 1: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totalTravel = travel2 + travel2 + travel3;
                                if (travel3 < travel1) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South-East");
                                }
                                else if (travel3 == travel1 && turnChoice1==2 && turnChoice2==2)
                                {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South");
                                }
                                else if (travel3>travel1 && turnChoice1==2 && turnChoice2==2)
                                {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South-West");
                                }
                                else {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-west");
                                }
                            }
                            case 2: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totalTravel = travel2 + travel2 + travel3;
                                if (travel3 < travel1) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South-East");
                                } else if (travel3 == travel1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South");
                                }
                                else if (travel3>travel1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords South-West");
                                }else {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-west");

                                }
                                break;

                            }//..
                            default: {
                                System.out.println("You have entered wrong input.please come from first");
                            }
                        }
                        break;

                    }
                    default: {
                        System.out.println("You have entered wrong input.please come from first");
                    }
                }
            }

                //main case 4

            case 4: {
                System.out.println("enter distance u want to travel :");
                double travel1 = scan.nextDouble();
                System.out.println("enter 1 to take left");
                System.out.println("enter 2 to take right");
                int turnChoice1 = scan.nextInt();
                switch (turnChoice1) {
                    case 1: {
                        System.out.println("enter distance u want to travel");
                        double travel2 = scan.nextDouble();
                        System.out.println("enter 1 to take left");
                        System.out.println("enter 2 to take right");
                        int turnChoice2 = scan.nextInt();
                        switch (turnChoice2) {
                            case 1: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totaltravelFirst = travel1 + travel2 + travel3;
                                //h
                                if (travel3 < travel1 ) {
                                    System.out.println("You have travelled " + totaltravelFirst + " km towords South-West");
                                } else if (travel3 == travel1 && turnChoice1==1 && turnChoice2==1) {
                                    System.out.println("You have travelled :" + totaltravelFirst + " km towords South");
                                }
                                else if (travel3 >travel1 && turnChoice1==1 && turnChoice2==1) {
                                    System.out.println("You have travelled :" + totaltravelFirst + " km towords South-East");
                                }else {
                                    System.out.println("You have travelled " + totaltravelFirst + " km towords South-West");
                                }
                            }
                            break;
                            case 2: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totaltravelFirstRight = travel1 + travel2 + travel3;
                                //h
                                if (travel3 < travel1) {
                                    //just
                                    System.out.println("You have travelled " + totaltravelFirstRight + " km towords South-West");
                                }
                                else if (turnChoice1==1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totaltravelFirstRight + " km towords South-West");
                                }
                                else if (travel3 == travel1 && turnChoice2==1) {
                                    System.out.println("You have travelled :" + totaltravelFirstRight + " km towords South");
                                }
                                else {
                                    System.out.println("You have travelled " + totaltravelFirstRight + " km towords North-East");
                                }
                                break;
                            }

                            default: {
                                System.out.println("You have entered wrong input.Please come from start");
                            }
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("enter distance u want to travel");
                        double travel2 = scan.nextDouble();
                        System.out.println("enter 1 to take left");
                        System.out.println("enter 2 to take right");
                        int turnChoice2 = scan.nextInt();
                        switch (turnChoice2) {
                            case 1: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totalTravel = travel2 + travel2 + travel3;
                                if (travel3 < travel1) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-west");
                                } else if (travel3 == travel1 && turnChoice1==2 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North");
                                }
                                else if (travel3>travel1 && turnChoice1==2 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-East");
                                }else {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-west");
                                }
                            }
                            case 2: {
                                System.out.println("enter distance u want to travel");
                                double travel3 = scan.nextDouble();
                                double totalTravel = travel2 + travel2 + travel3;
                                if (travel3 < travel1) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-west");
                                } else if (travel3 == travel1 && turnChoice2==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North");
                                }
                                else if (travel3>travel1 && turnChoice2==2 && turnChoice1==2) {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-East");
                                }else {
                                    System.out.println("You have travelled :" + totalTravel + " km towords North-west");

                                }
                                break;

                            }//..
                            default: {
                                System.out.println("You have entered wrong input.please come from first");
                            }
                        }
                        break;

                    }
                    default: {
                        System.out.println("You have entered wrong input.please come from first");
                    }
                }
            }

                break;

            default:{
                System.out.println("You have entered wrong input.Please come from first");
            }
        }
    }
}


