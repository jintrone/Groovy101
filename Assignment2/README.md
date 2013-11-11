Turn assignment one into a class that takes
as constructor parameters a map of factors->words,
and prints the numbers from 1 to 100, but for multiples in the factor
list print the relevant words instead.  For example, calling your
class as follows:
 	new FizzBuzz([2:”alpha”,3:”beta”,5:”gamma”])

should print:

	1
	alpha
	beta
	alpha
	gamma
	alphabeta
	…
