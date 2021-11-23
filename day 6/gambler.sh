money=100
count=0
wins=0
lost=0

while [ $money -gt 0 ] && [ $money -lt 200 ]
do
	toss=$((RANDOM%2))
	if [[ $toss -eq 0 ]]; then
    		echo "HEAD"
		wins=$(($wins+1))
	else
		echo "TAIL"
		money=$((money-1))
		lost=$((lost+1))
	fi
		count=$((count+1))
done

echo "Money: $money" 
echo "Number of bets made: $count"
echo "Win: $wins"
echo "Lost: $lost"
