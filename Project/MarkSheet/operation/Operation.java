package operation;

import datapackage.*;
import printonconsol.*;
import java.util.*;

public class Operation // BL Class
{
	static int i = 0;
	static int n = 0;
	String resetColor = "\u001B[0m";
	String color = "\u001B[31m";

	public void opChoice(Operation ob) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		Operation ob1 = new Operation();
		PrintOnConsol ob2 = new PrintOnConsol();
		DataClass[] student = new DataClass[100];

		int choice = 0, num = 0;
		String id, pass;
		do {
			System.out.print("Enter User id : ");
			id = sc.nextLine();
			System.out.print("Enter Password : ");
			pass = sc.nextLine();
			if (id.equals("Sohan") && pass.equals("2002")) {
				do {
					System.out.println("\n\t\t\t\t\t     Your Choice are ");
					System.out.print("\t\t-----------------------");
					System.out.println("\t\t\t\t-----------------------");
					System.out.print("\t\t 1 For Insart Data");

					System.out.println("\t\t\t\t 2 For Search Record");
					System.out.print("\t\t-----------------------");
					System.out.println("\t\t\t\t-----------------------\n\n");
					System.out.print("\t\t-----------------------");
					System.out.println("\t\t\t\t-----------------------");
					System.out.print("\t\t 3 For Update Record");
					System.out.println("\t\t\t\t 50 For Home Screen");
					System.out.print("\t\t-----------------------");
					System.out.println("\t\t\t\t-----------------------\n\n");
					System.out.println("\n\t\t\t\t\t     Enter Your Choice");
					boolean flag = false;
					do {
						try {
							flag = false;
							choice = sc.nextInt();

						} catch (InputMismatchException e) {
							flag = true;
							System.out.println("Invalid Input Please Enter Your choice in int ");
						}
						sc.nextLine();
					} while (flag);
					System.out.println(
							" ____________________________________________________________________________________________________________________");
					switch (choice) {
						case 1:
							if (n == 0) {
								System.out.println("\t\t-------------------------------");
								do {
									System.out.print("\t\t  Enter number of student : ");
									try {
										flag = false;
										n = sc.nextInt();

									} catch (InputMismatchException e) {
										flag = true;
										System.out.println("Invalid Input Please Enter Your choice in int ");
									}
									sc.nextLine();
								} while (flag);

								System.out.println("\t\t-------------------------------");
								ob1.takeInput(n, student, ob1);
								System.out.println("Hello");
							} else {
								System.out.println(color
										+ "\t\t  --------------------------------------------------------------------");
								System.out.println(
										"\t\t      Sum student Data allreday exisit please choose Update Record choices : ");
								System.out.println(
										"\t\t  --------------------------------------------------------------------"
												+ resetColor);
							}
							break;
						case 2:
							if (i != 0) {
								ob1.choice(student, n, ob1);
							} else {
								System.out.println(color
										+ "\t\t  --------------------------------------------------------------------");
								System.out
										.println("\t\t      Student data not aveleval please  insert sum student data");
								System.out.println(
										"\t\t  --------------------------------------------------------------------"
												+ resetColor);

							}
							break;
						case 3:
							if (i != 0) {
								System.out.print("\nHow many student data enter");
								num = sc.nextInt();
								n += num;
								ob.takeInput(n, student, ob1);
							} else {
								System.out.println(color
										+ "\t\t  --------------------------------------------------------------------");
								System.out.print(
										"\t\t      please enter sum student data then you can update the record : \n");
								System.out.println(
										"\t\t  --------------------------------------------------------------------"
												+ resetColor);
							}
							break;
						case 50:
							System.exit(0);
					}
				} while (choice != 50);
			} else {
				System.out.println("Please enter valide id password");
			}
		} while (id != "Sohan" && pass != "2002");
	}

	public void choice(DataClass student[], int n, Operation ob2) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		PrintOnConsol poc = new PrintOnConsol();
		int choice = 0, searchRoll = 0;
		boolean flag;
		String searchName;
		do {
			System.out.println("\n\t\t\t\t\t     Your Choice are ");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\t\t 1 For Search by Roll Number");
			System.out.println("\t\t\t\t 2 For Search by Name");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\n\n\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\t\t 3 For Search by Division");
			System.out.println("\t\t\t\t 4 For All MarkSheet");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.println("\n\t\t-------------------------------");
			System.out.println("\t\t 5 For Exit");
			System.out.println("\t\t-------------------------------");
			System.out.println("\n\n\t\t\t\t\t     Enter Your Choice");
			do {
				try {
					flag = false;
					choice = sc.nextInt();

				} catch (InputMismatchException e) {
					flag = true;
					System.out.println("Invalid Input Please Enter Your choice in int ");
					System.out.println("Please Enter Valide Input ");
				}
				sc.nextLine();
			} while (flag);
			System.out.println(
					" ____________________________________________________________________________________________________________________");
			switch (choice) {
				case 1:
					System.out.println("\t\t---------------------------");
					do {
						try {
							flag = false;
							System.out.print("\t\t  Enter Roll number : ");
							searchRoll = sc.nextInt();

						} catch (InputMismatchException e) {
							flag = true;
							System.out.println("Invalid Input Please Enter Your Roll Number in int ");
						}
					} while (flag);
					sc.nextLine();
					System.out.println("\t\t---------------------------");
					for (int j = 0; j < n; j++) {
						if (student[j].getRollNumber() == searchRoll) {
							poc.printMarksheet(student, j);
							flag = true;
							break;
						}
					}
					if (!flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      Enter Roll Number Is Not exist : ");
						System.out.println("\t\t  --------------------------------------------------------------------"
								+ resetColor);
					}
					break;
				case 2:
					System.out.println("\t\t---------------------------");
					System.out.print("\t\t  Enter Your Name : ");
					searchName = sc.nextLine();
					System.out.println("\t\t---------------------------");

					for (int i = 0; i < n; i++) {
						if (student[i].getName().equals(searchName)) {
							poc.printMarksheet(student, i);
							flag = true;
						}
					}
					if (!flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      Enter Name Is Not exist : ");
						System.out.println("\t\t  --------------------------------------------------------------------"
								+ resetColor);
					}
					break;
				case 3:
					ob2.searchDivision(student, n, ob2);
					break;
				case 4:
					for (int i = 0; i < n; i++) {
						poc.printMarksheet(student, i);
					}
					break;
			}
		} while (choice != 5);
	}

	public void takeInput(int n, DataClass student[], Operation ob2) throws ClassNotFoundException {
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		Scanner sc = new Scanner(System.in);
		// Mark ob = new Mark();
		String corse, name, fname, mname, branch;

		int physics, chemistry, math, hindi, english, year, roll, sem;
		for (; i < n; i++) {
			// student[i] = new DataClass();

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Roll number : ");
			roll = ob2.takeRoll(student, i, ob2);
			System.out.println("\t\t-------------------------------");

			// sc.nextLine();
			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your name : ");
			name = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your Father name : ");
			fname = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");

			System.out.print("\t\t  Enter Your Mother Name : ");
			mname = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Course name : ");
			corse = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your Branch name : ");
			branch = sc.nextLine();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your year : ");
			year = ob2.takeYear();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter Your Sem : ");
			sem = ob2.takeSem(year);
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of phycics : ");
			physics = ob2.takeMark();
			System.out.println("\t\t-------------------------------");
			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of chemistry : ");
			chemistry = ob2.takeMark();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of mathes : ");
			math = ob2.takeMark();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of Hindi : ");
			hindi = ob2.takeMark();
			System.out.println("\t\t-------------------------------");

			System.out.println("\n\t\t-------------------------------");
			System.out.print("\t\t  Enter marks of English : ");
			english = ob2.takeMark();
			System.out.println("\t\t-------------------------------");

			student[i] = new DataClass(name, fname, mname, sem, branch, corse, year, roll, physics, chemistry, math,
					hindi, english);
			student[i].setTotel();
			student[i].setPer();

			System.out.println(
					" ____________________________________________________________________________________________________________________");
		}
	}

	public void searchDivision(DataClass student[], int n, Operation ob2) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);

		PrintOnConsol poc = new PrintOnConsol();
		boolean flag;
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		int choice = 0;
		do {
			flag = true;
			System.out.println("\n\t\t\t\t\t     Your Choice are ");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\t\t 1 For First Division");
			System.out.println("\t\t\t\t\t 2 For Second Division");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\n\n\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.print("\t\t 3 For Third Division");
			System.out.println("\t\t\t\t\t 6 For Back");
			System.out.print("\t\t-------------------------------");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.println("\n\n\t\t\t\t\t     Enter Your Choice");
			do {
				try {
					flag = false;
					choice = sc.nextInt();

				} catch (InputMismatchException e) {
					flag = true;
					System.out.println("Invalid Input Please Enter Your choice in int ");
				}
				sc.nextLine();
			} while (flag);
			System.out.println(
					" ____________________________________________________________________________________________________________________");
			switch (choice) {
				case 1:
					for (int i = 0; i < n; i++) {
						if (student[i].getPer() >= 60 && student[i].getPer() <= 100 && student[i].getphysics() > 33
								&& student[i].getchemistry() > 33 && student[i].getmath() > 33
								&& student[i].gethindi() > 33 && student[i].getenglish() > 33) {
							poc.printMarksheet(student, i);
							flag = false;
						}
					}
					if (flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      First Division student Not aveleval");
						System.out.println("\t\t  --------------------------------------------------------------------"
								+ resetColor);
					}
					break;
				case 2:
					for (int i = 0; i < n; i++) {
						if (student[i].getPer() >= 45 && student[i].getPer() < 60 && student[i].getphysics() > 33
								&& student[i].getchemistry() > 33 && student[i].getmath() > 33
								&& student[i].gethindi() > 33 && student[i].getenglish() > 33) {
							poc.printMarksheet(student, i);
							flag = false;
						}
					}
					if (flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      Second Division student Not aveleval");
						System.out.println("\t\t  --------------------------------------------------------------------"
								+ resetColor);
					}
					break;
				case 3:
					for (int i = 0; i < n; i++) {
						if (student[i].getPer() >= 33 && student[i].getPer() < 45 && student[i].getphysics() > 33
								&& student[i].getchemistry() > 33 && student[i].getmath() > 33
								&& student[i].gethindi() > 33 && student[i].getenglish() > 33) {
							poc.printMarksheet(student, i);
							flag = false;
						}
					}
					if (flag) {
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------");
						System.out.println("\t\t\t\t      Third Division student Not aveleval");
						System.out.println(
								color + "\t\t  --------------------------------------------------------------------"
										+ resetColor);
					}
			}
		} while (choice != 6);
	}

	public int takeRoll(DataClass student[], int i, Operation ob2)
			throws ClassNotFoundException, NumberFormatException {
		Scanner sc = new Scanner(System.in);
		boolean flag;
		int roll = 0;
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		do {

			do {
				try {
					flag = false;

					roll = sc.nextInt();

				} catch (InputMismatchException e) {
					flag = true;
					System.out.println("Invalid Input Please Enter Your Roll num in int ");
				}
				sc.nextLine();
			} while (flag);

			flag = false;
			for (int j = 0; i > 0 && j < i; j++) {
				if (student[j].getRollNumber() == roll) {
					System.out.println(
							color + "\t\t  --------------------------------------------------------------------");
					System.out.println("\t\t      Duplicate Roll Number ");
					System.out.println(
							"\t\t  --------------------------------------------------------------------" + resetColor);
					System.out.print("\t\t  Enter Agean Roll number : ");
					flag = true;
				}
			}
		} while (flag);
		return roll;
	}

	public int takeMark() throws ClassNotFoundException {
		String resetColor = "\u001B[0m";
		String color = "\u001B[31m";
		Scanner sc = new Scanner(System.in);
		int mark = 0;
		boolean flag = false;
		do {
			do {
				try {
					flag = false;

					mark = sc.nextInt();

				} catch (InputMismatchException e) {
					flag = true;
					System.out.println("Invalid Input Please Enter Your Mark in int ");
				}
				sc.nextLine();
			} while (flag);
			if (mark < 0 || mark > 100) {
				System.out
						.println(color + "\t\t  --------------------------------------------------------------------");
				System.out.println("\t\t      Invalide marks of Please enter Agen mark!");
				System.out.println(
						"\t\t  --------------------------------------------------------------------" + resetColor);
			}
		} while (mark < 0 || mark > 100);
		return mark;
	}

	public int takeYear() throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		boolean flag = false;
		do {
			do {
				try {
					flag = false;

					year = sc.nextInt();

				} catch (InputMismatchException e) {
					flag = true;
					System.out.println("Invalid Input Please Enter Your Year in int ");
				}
				sc.nextLine();
			} while (flag);
			if (year <= 0 || year >= 5) {
				System.out.println("\t\t      Please Enter Valide Year");
			}
		} while (year <= 0 || year >= 5);
		return year;
	}

	public int takeSem(int year) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		int sem = 0;
		boolean flag = false;
		switch (year) {
			case 1:
				do {
					do {
						try {
							flag = false;

							sem = sc.nextInt();

						} catch (InputMismatchException e) {
							flag = true;
							System.out.println("Invalid Input Please Enter Your Sem in int ");
						}
						sc.nextLine();
					} while (flag);
					if (sem != 1 && sem != 2) {
						System.out.println("\t\t      Please Enter Valide Sem");
					}
				} while (sem != 1 && sem != 2);
				break;
			case 2:
				do {
					do {
						try {
							flag = false;

							sem = sc.nextInt();

						} catch (InputMismatchException e) {
							flag = true;
							System.out.println("Invalid Input Please Enter Your Sem in int ");
						}
						sc.nextLine();
					} while (flag);
					if (sem != 3 && sem != 4) {
						System.out.println("\t\t      Please Enter Valide Sem");
					}
				} while (sem != 3 && sem != 4);
				break;
			case 3:
				do {
					do {
						try {
							flag = false;

							sem = sc.nextInt();

						} catch (InputMismatchException e) {
							flag = true;
							System.out.println("Invalid Input Please Enter Your Sem in int ");
						}
						sc.nextLine();
					} while (flag);

					if (sem != 5 && sem != 6) {
						System.out.println("\t\t      Please Enter Valide Sem");
					}
				} while (sem != 5 && sem != 6);
				break;
			case 4:
				do {
					do {
						try {
							flag = false;

							sem = sc.nextInt();

						} catch (InputMismatchException e) {
							flag = true;
							System.out.println("Invalid Input Please Enter Your Sem in int ");
						}
						sc.nextLine();
					} while (flag);
					if (sem != 7 && sem != 8) {
						System.out.println("\t\t      Please Enter Valide Sem");
					}
				} while (sem != 7 && sem != 8);
		}
		return sem;
	}
}