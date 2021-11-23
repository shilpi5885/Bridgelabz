#Extend the Prime Factorization Program to store all the Prime Factors of a number n into an array and finally display the output.

read -p "Enter the number:" number
counter=0

for ((count=2 ; count<= $number ; count++ ))
do
	while (($number%$count == 0 ))
	do
		primeFactors[((counter++))]=$count
		number=$((number/count))
	done
done

echo "${primeFactors[@]}" 
