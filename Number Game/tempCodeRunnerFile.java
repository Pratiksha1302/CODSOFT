

                attempts++;
            }

            if (!guessedCorrectly) {

                System.out.println("\nOops! You have used up all your attempts.");
                System.out.println("The correct number was: " + generatedNumber);
            }

            System.out.print("\nWould you like to play this game again? (Yes/No) => ");
            String playAgainResponse = sc.nextLine();

            if (!playAgainResponse.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nGame over! Your score is: " + score);
        System.out.println("Thanks for playing!");
    }
}