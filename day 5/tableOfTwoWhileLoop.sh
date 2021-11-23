#Write a program that takes a command-line argument n and prints a table of the powers of 2 
#that are less than or equal to 2^n till 256 is reached

echo "Enter a number"
read n
powerOfTwo=1
i=0
r=0
while (($i<= $n &&  $r < 256))
do
	r=$((2**i))

	echo 2 ^ $i = $r

	i=$((i+1))
done
