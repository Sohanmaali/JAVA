

import java.util.Scanner;
class Calender
{
	public static void main(String[]args)                                  
	{
		int choice,month;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("you Year is \n\t1 For 2023\n\t2 For 2024");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			
				System.out.println("presh \n\t1 For January\n\t2 For February\n\t3 For March\n\t4 For April\n\t5 For May\n\t6 For June\n\t7 For July\n\t8 For August\n\t9 For September\n\t10 For October\n\t11 For November\n\t12 For December");
				System.out.println("Enter your choice");
				month = sc.nextInt();
				switch (month)
				{
					case 1:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| January  ::::::::::::::   2023   |");
						
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| 01 | 02 | 03 | 04 | 05 | 06 | 07 |");
						System.out.println("|__________________________________|");
						System.out.println("| 08 | 09 | 19 | 11 | 12 | 13 | 14 |");
						System.out.println("|__________________________________|");
						System.out.println("| 15 | 16 | 17 | 18 | 19 | 20 | 21 |");
						System.out.println("|__________________________________|");
						System.out.println("| 22 | 23 | 24 | 25 | 26 | 27 | 28 |");
						System.out.println("|__________________________________|");
						System.out.println("| 29 | 30 | 31 | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 2:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| February  ::::::::::::::  2023   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | 01 | 02 | 03 | 04 |");
						System.out.println("|__________________________________|");
						System.out.println("| 05 | 06 | 07 | 08 | 09 | 10 | 11 |");
						System.out.println("|__________________________________|");
						System.out.println("| 12 | 13 | 14 | 15 | 16 | 17 | 18 |");
						System.out.println("|__________________________________|");
						System.out.println("| 19 | 20 | 21 | 22 | 23 | 24 | 25 |");
						System.out.println("|__________________________________|");
						System.out.println("| 26 | 27 | 28 | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 3:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| March  ::::::::::::::   2023     |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | 01 | 02 | 03 | 04 |");
						System.out.println("|__________________________________|");
						System.out.println("| 05 | 06 | 07 | 08 | 09 | 19 | 11 |");
						System.out.println("|__________________________________|");
						System.out.println("| 12 | 13 | 14 | 15 | 16 | 17 | 18 |");
						System.out.println("|__________________________________|");
						System.out.println("| 19 | 20 | 21 | 22 | 23 | 24 | 25 |");
						System.out.println("|__________________________________|");
						System.out.println("| 26 | 27 | 28 | 29 | 30 | 31 | :: |");
						System.out.println("|__________________________________|");
						break;
					case 4:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| April    ::::::::::::::::   2023 |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | :: | 01 |");
						System.out.println("|__________________________________|");
						System.out.println("| 02 | 03 | 04 | 05 | 06 | 07 | 08 |");
						System.out.println("|__________________________________|");
						System.out.println("| 09 | 19 | 11 | 12 | 13 | 14 | 15 |");
						System.out.println("|__________________________________|");
						System.out.println("| 16 | 17 | 18 | 19 | 20 | 21 | 22 |");
						System.out.println("|__________________________________|");
						System.out.println("| 23 | 24 | 25 | 26 | 27 | 28 | 29 |");
						System.out.println("| 30 | 31 | :: | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 5:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| May    ::::::::::::::::   2023   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | 01 | 02 | 03 | 04 | 05 | 06 |");
						System.out.println("|__________________________________|");
						System.out.println("| 07 | 08 | 09 | 19 | 11 | 12 | 13 |");
						System.out.println("|__________________________________|");
						System.out.println("| 14 | 15 | 16 | 17 | 18 | 19 | 20 |");
						System.out.println("|__________________________________|");
						System.out.println("| 21 | 22 | 23 | 24 | 25 | 26 | 27 |");
						System.out.println("|__________________________________|");
						System.out.println("| 28 | 29 | 30 | 31 | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;					case 6:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| June   ::::::::::::::::   2023   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | 01 | 02 | 03 |");
						System.out.println("|__________________________________|");
						System.out.println("| 04 | 05 | 06 | 07 | 08 | 09 | 10 |");
						System.out.println("|__________________________________|");
						System.out.println("| 11 | 12 | 13 | 14 | 15 | 16 | 17 |");
						System.out.println("|__________________________________|");
						System.out.println("| 18 | 19 | 20 | 21 | 22 | 23 | 24 |");
						System.out.println("|__________________________________|");
						System.out.println("| 25 | 26 | 27 | 28 | 29 | 30 | :: |");
						System.out.println("|__________________________________|");
						break;
					case 7:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| July    ::::::::::::::::   2023  |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | :: | 01 |");
						System.out.println("|__________________________________|");
						System.out.println("| 02 | 03 | 04 | 05 | 06 | 07 | 08 |");
						System.out.println("|__________________________________|");
						System.out.println("| 09 | 19 | 11 | 12 | 13 | 14 | 15 |");
						System.out.println("|__________________________________|");
						System.out.println("| 16 | 17 | 18 | 19 | 20 | 21 | 22 |");
						System.out.println("|__________________________________|");
						System.out.println("| 23 | 24 | 25 | 26 | 27 | 28 | 29 |");
						System.out.println("| 30 | 31 | :: | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 8:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| August ::::::::::::::::   2023   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | 01 | 02 | 03 | 04 | 05 |");
						System.out.println("|__________________________________|");
						System.out.println("| 06 | 07 | 08 | 09 | 10 | 11 | 12 |");
						System.out.println("|__________________________________|");
						System.out.println("| 13 | 14 | 15 | 16 | 17 | 18 | 19 |");
						System.out.println("|__________________________________|");
						System.out.println("| 20 | 21 | 22 | 23 | 24 | 25 | 26 |");
						System.out.println("|__________________________________|");
						System.out.println("| 27 | 28 | 29 | 30 | 31 | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 9:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| September ::::::::::::::: 2023   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | 01 | 02 |");
						System.out.println("|__________________________________|");
						System.out.println("| 03 | 04 | 05 | 06 | 07 | 08 | 09 |");
						System.out.println("|__________________________________|");
						System.out.println("| 10 | 11 | 12 | 13 | 14 | 15 | 16 |");
						System.out.println("|__________________________________|");
						System.out.println("| 17 | 18 | 19 | 20 | 21 | 22 | 23 |");
						System.out.println("|__________________________________|");
						System.out.println("| 24 | 25 | 26 | 27 | 28 | 29 | 30 |");
						System.out.println("|__________________________________|");
						break;
					case 10:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| October :::::::::::::::   2023   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| 01 | 02 | 03 | 04 | 05 | 06 | 07 |");
						System.out.println("|__________________________________|");
						System.out.println("| 08 | 09 | 19 | 11 | 12 | 13 | 14 |");
						System.out.println("|__________________________________|");
						System.out.println("| 15 | 16 | 17 | 18 | 19 | 20 | 21 |");
						System.out.println("|__________________________________|");
						System.out.println("| 22 | 23 | 24 | 25 | 26 | 27 | 28 |");
						System.out.println("|__________________________________|");
						System.out.println("| 29 | 30 | 31 | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 11:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| November ::::::::::::::   2023   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | 01 | 02 | 03 | 04 |");
						System.out.println("|__________________________________|");
						System.out.println("| 05 | 06 | 07 | 08 | 09 | 19 | 11 |");
						System.out.println("|__________________________________|");
						System.out.println("| 12 | 13 | 14 | 15 | 16 | 17 | 18 |");
						System.out.println("|__________________________________|");
						System.out.println("| 19 | 20 | 21 | 22 | 23 | 24 | 25 |");
						System.out.println("|__________________________________|");
						System.out.println("| 26 | 27 | 28 | 29 | 30 | 31 | :: |");
						System.out.println("|__________________________________|");
						break;
					case 12:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| December ::::::::::::::   2023   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | :: | 01 |");
						System.out.println("|__________________________________|");
						System.out.println("| 02 | 03 | 04 | 05 | 06 | 07 | 08 |");
						System.out.println("|__________________________________|");
						System.out.println("| 09 | 19 | 11 | 12 | 13 | 14 | 15 |");
						System.out.println("|__________________________________|");
						System.out.println("| 16 | 17 | 18 | 19 | 20 | 21 | 22 |");
						System.out.println("|__________________________________|");
						System.out.println("| 23 | 24 | 25 | 26 | 27 | 28 | 29 |");
						System.out.println("| 30 | 31 | :: | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
				}
				break;
			case 2:
				System.out.println("presh \n\t1 For January\n\t2 For February\n\t3 For March\n\t4 For April\n\t5 For May\n\t6 For June\n\t7 For July\n\t8 For August\n\t9 For September\n\t10 For October\n\t11 For November\n\t12 For December");
				System.out.println("Enter your choice");
				month = sc.nextInt();
				switch (month)
				{
					case 1:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| January  ::::::::::::::   2024   |");
						
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | 01 | 02 | 03 | 04 | 05 ");
						System.out.println("|__________________________________|");
						System.out.println("| 06 | 07 | 08 | 09 | 19 | 11 | 12 |");
						System.out.println("|__________________________________|");
						System.out.println("| 13 | 14 | 15 | 16 | 17 | 18 | 19 |");
						System.out.println("|__________________________________|");
						System.out.println("| 20 | 21 | 22 | 23 | 24 | 25 | 26 |");
						System.out.println("|__________________________________|");
						System.out.println("| 27 | 28 | 29 | 30 | 31 | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 2:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| February  ::::::::::::::  2024   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | 01 | 02 |");
						System.out.println("|__________________________________|");
						System.out.println("| 03 | 04 | 05 | 06 | 07 | 08 | 09 |");
						System.out.println("|__________________________________|");
						System.out.println("| 10 | 11 | 12 | 13 | 14 | 15 | 16 |");
						System.out.println("|__________________________________|");
						System.out.println("| 17 | 18 | 19 | 20 | 21 | 22 | 23 |");
						System.out.println("|__________________________________|");
						System.out.println("| 24 | 25 | 26 | 27 | 28 | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 3:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| March  ::::::::::::::   2024     |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | 01 | 02 |");
						System.out.println("|__________________________________|");
						System.out.println("| 03 | 04 | 05 | 06 | 07 | 08 | 09 |");
						System.out.println("|__________________________________|");
						System.out.println("| 19 | 11 | 12 | 13 | 14 | 15 | 16 |");
						System.out.println("|__________________________________|");
						System.out.println("| 17 | 18 | 19 | 20 | 21 | 22 | 23 |");
						System.out.println("|__________________________________|");
						System.out.println("| 24 | 25 | 26 | 27 | 28 | 29 | 30 |");
						System.out.println("|__________________________________|");
						System.out.println("| 31 | :: | :: | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 4:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| April    ::::::::::::::::   2024 |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("|__________________________________|");
						System.out.println("| :: | 01 | 02 | 03 | 04 | 05 | 06 |");
						System.out.println("|__________________________________|");
						System.out.println("| 07 | 08 | 09 | 19 | 11 | 12 | 13 |");
						System.out.println("|__________________________________|");
						System.out.println("| 14 | 15 | 16 | 17 | 18 | 19 | 20 |");
						System.out.println("|__________________________________|");
						System.out.println("| 21 | 22 | 23 | 24 | 25 | 26 | 27 |");
						System.out.println("|__________________________________|");
						System.out.println("| 28 | 29 | 30 | 31 | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 5:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| May    ::::::::::::::::   2024   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | 01 | 02 | 03 | 04 | 05 | 06 |");
						System.out.println("|__________________________________|");
						System.out.println("| 07 | 08 | 09 | 19 | 11 | 12 | 13 |");
						System.out.println("|__________________________________|");
						System.out.println("| 14 | 15 | 16 | 17 | 18 | 19 | 20 |");
						System.out.println("|__________________________________|");
						System.out.println("| 21 | 22 | 23 | 24 | 25 | 26 | 27 |");
						System.out.println("|__________________________________|");
						System.out.println("| 28 | 29 | 30 | 31 | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;					case 6:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| June   ::::::::::::::::   2024   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | 01 | 02 | 03 |");
						System.out.println("|__________________________________|");
						System.out.println("| 04 | 05 | 06 | 07 | 08 | 09 | 10 |");
						System.out.println("|__________________________________|");
						System.out.println("| 11 | 12 | 13 | 14 | 15 | 16 | 17 |");
						System.out.println("|__________________________________|");
						System.out.println("| 18 | 19 | 20 | 21 | 22 | 23 | 24 |");
						System.out.println("|__________________________________|");
						System.out.println("| 25 | 26 | 27 | 28 | 29 | 30 | :: |");
						System.out.println("|__________________________________|");
						break;
					case 7:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| July    ::::::::::::::::   2024  |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | :: | 01 |");
						System.out.println("|__________________________________|");
						System.out.println("| 02 | 03 | 04 | 05 | 06 | 07 | 08 |");
						System.out.println("|__________________________________|");
						System.out.println("| 09 | 19 | 11 | 12 | 13 | 14 | 15 |");
						System.out.println("|__________________________________|");
						System.out.println("| 16 | 17 | 18 | 19 | 20 | 21 | 22 |");
						System.out.println("|__________________________________|");
						System.out.println("| 23 | 24 | 25 | 26 | 27 | 28 | 29 |");
						System.out.println("| 30 | 31 | :: | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 8:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| August ::::::::::::::::   2024   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | 01 | 02 | 03 | 04 | 05 |");
						System.out.println("|__________________________________|");
						System.out.println("| 06 | 07 | 08 | 09 | 10 | 11 | 12 |");
						System.out.println("|__________________________________|");
						System.out.println("| 13 | 14 | 15 | 16 | 17 | 18 | 19 |");
						System.out.println("|__________________________________|");
						System.out.println("| 20 | 21 | 22 | 23 | 24 | 25 | 26 |");
						System.out.println("|__________________________________|");
						System.out.println("| 27 | 28 | 29 | 30 | 31 | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 9:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| September ::::::::::::::: 2024   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | 01 | 02 |");
						System.out.println("|__________________________________|");
						System.out.println("| 03 | 04 | 05 | 06 | 07 | 08 | 09 |");
						System.out.println("|__________________________________|");
						System.out.println("| 10 | 11 | 12 | 13 | 14 | 15 | 16 |");
						System.out.println("|__________________________________|");
						System.out.println("| 17 | 18 | 19 | 20 | 21 | 22 | 23 |");
						System.out.println("|__________________________________|");
						System.out.println("| 24 | 25 | 26 | 27 | 28 | 29 | 30 |");
						System.out.println("|__________________________________|");
						break;
					case 10:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| October :::::::::::::::   2024   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| 01 | 02 | 03 | 04 | 05 | 06 | 07 |");
						System.out.println("|__________________________________|");
						System.out.println("| 08 | 09 | 19 | 11 | 12 | 13 | 14 |");
						System.out.println("|__________________________________|");
						System.out.println("| 15 | 16 | 17 | 18 | 19 | 20 | 21 |");
						System.out.println("|__________________________________|");
						System.out.println("| 22 | 23 | 24 | 25 | 26 | 27 | 28 |");
						System.out.println("|__________________________________|");
						System.out.println("| 29 | 30 | 31 | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					case 11:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| November ::::::::::::::   2024   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | 01 | 02 | 03 | 04 |");
						System.out.println("|__________________________________|");
						System.out.println("| 05 | 06 | 07 | 08 | 09 | 19 | 11 |");
						System.out.println("|__________________________________|");
						System.out.println("| 12 | 13 | 14 | 15 | 16 | 17 | 18 |");
						System.out.println("|__________________________________|");
						System.out.println("| 19 | 20 | 21 | 22 | 23 | 24 | 25 |");
						System.out.println("|__________________________________|");
						System.out.println("| 26 | 27 | 28 | 29 | 30 | 31 | :: |");
						System.out.println("|__________________________________|");
						break;
					case 12:
						System.out.println("____________________________________");
						System.out.println("|                                  |");
						System.out.println("| December ::::::::::::::   2024   |");
						System.out.println("|________________________________  |");
						System.out.println("| Sun| Mon|tues| wed|tras| fri| sat|");
						System.out.println("|________________________________  |");
						System.out.println("| :: | :: | :: | :: | :: | :: | 01 |");
						System.out.println("|__________________________________|");
						System.out.println("| 02 | 03 | 04 | 05 | 06 | 07 | 08 |");
						System.out.println("|__________________________________|");
						System.out.println("| 09 | 19 | 11 | 12 | 13 | 14 | 15 |");
						System.out.println("|__________________________________|");
						System.out.println("| 16 | 17 | 18 | 19 | 20 | 21 | 22 |");
						System.out.println("|__________________________________|");
						System.out.println("| 23 | 24 | 25 | 26 | 27 | 28 | 29 |");
						System.out.println("| 30 | 31 | :: | :: | :: | :: | :: |");
						System.out.println("|__________________________________|");
						break;
					
				}
				break;

		}
	}
}