package array_imp;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of Array: ");
		int arraySize = sc.nextInt();
		int[] firstArray = new int[arraySize];

		System.out.println("Now enter " + arraySize + " element and hit Enter key.");
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = sc.nextInt();
		}

		System.out.println(
				"Choose an option for: \n" +
						"1-Traverse (Print Elements) \n" +
						"2-Search Value \n" +
						"3-Insert Element\n" +
						"4-Remove Element\n" +
						"5-Sort Elements");

		int option = sc.nextInt();

		// Traverse to all elements
		if (option == 1) {
			for (int i = 0; i < firstArray.length; i++) {
				System.out.println("[" + i + "] => " + firstArray[i]);
			}
		}

		// Search for a value in Array elements
		else if (option == 2) {
			System.out.println("Enter the value to serach: ");
			int value = sc.nextInt();
			for (int i = 0; i < firstArray.length; i++) {
				if (firstArray[i] == value) {
					System.out.println("Found in index [" + i + "]");
					break;
				}
			}
		}

		// insert arrray element
		else if (option == 3) {
			int[] newArray = new int[firstArray.length + 1];

			System.out.println("Enter the element to insert: ");
			int newElement = sc.nextInt();

			System.out
					.println(
							"Where you want to insert new Element: \n 1-At the Begining\n 2-At the End\n 3-At a specific index");

			int insertOpt = sc.nextInt();

			if (insertOpt == 1) {
				newArray[0] = newElement;
				for (int i = 1; i < newArray.length; i++) {
					newArray[i] = firstArray[i - 1];
				}
			}

			else if (insertOpt == 2) {
				for (int i = 0; i < firstArray.length; i++) {
					newArray[i] = firstArray[i];
				}
				newArray[firstArray.length] = newElement;
			}

			else if (insertOpt == 3) {
				System.out.println("Enter index: ");
				int index = sc.nextInt();

				for (int i = 0; i < newArray.length; i++) {
					if (i < index)
						newArray[i] = firstArray[i];
					else if (i == index)
						newArray[i] = newElement;
					else
						newArray[i] = firstArray[i - 1];
				}
			}

			System.out.println("Array elements extended to: ");
			for (int i = 0; i < newArray.length; i++) {
				System.out.println(newArray[i]);
			}
		}

		// Remove arrray element
		else if (option == 4) {
			int[] newArray = new int[firstArray.length - 1];
			System.out.println("Enter the index to delete element: ");
			int index = sc.nextInt();
			for (int i = 0; i < firstArray.length; i++) {
				if (i < index) {
					newArray[i] = firstArray[i];
				} else if (i > index) {
					newArray[i - 1] = firstArray[i];
				}
			}
			System.out.println("Element Deleted");
			for (int i = 0; i < newArray.length; i++) {
				System.out.println(newArray[i]);
			}
		}

		// Sorting logic
		else if (option == 5) {
			System.out.println("Array elements after sorting:");
			for (int i = 0; i < firstArray.length; i++) {
				for (int j = i + 1; j < firstArray.length; j++) {
					if (firstArray[i] > firstArray[j]) {
						int temp = firstArray[i];
						firstArray[i] = firstArray[j];
						firstArray[j] = temp;
					}
				}
				System.out.println(firstArray[i]);
			}
		} else {
			System.out.println("The selected option is not available!!!");
		}
		sc.close();
	}
}
