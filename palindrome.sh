#Write a function to check if the two numbers are Palindromes

echo "enter first number"
read num
echo "enter second number"
read num2
function pal
{
reverse=0
while [ $num -gt 0 ]
do
a=$(($num % 10))
num=$(($num / 10))
reverse=$((reverse * 10 + $a))
done
echo $reverse
if [ $num2 -eq $reverse ]
then
    echo "Number is palindrome"
else
    echo "Number is not palindrome"
fi
}
r=`pal $num $num2`
echo "$r"
