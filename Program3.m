%% Exchanging Bytelandian gold coin(s) into American dollars (https://www.codechef.com/problems/COINS)

prompt ='How many testcases do you want to try: ';
loop = input(prompt);
for i =1:loop
prompt = 'How many Bytelandian gold coin(s) do you wish to exchange(integer only): ';
value = input(prompt);
x1 = fix(value/2);
x2 = fix(value/3);
x3 = fix(value/4);
Sum = x1 + x2 + x3;

    if (Sum > value)
         disp('The best conversion rate is to convert to 3 american coins, the following values are those coins');
         disp([x1 x2 x3]);
         disp('The sum of these three coins is:');
         disp(Sum);
         
    elseif (Sum < value)
         
         disp('The best conversion rate is to convert 1:1, the following value is that coin');
         disp(value);
         
    else
         disp('Either conversion rate works');
         disp([x1 x2 x3]);
         disp('or');
         disp(value);
             
    end
end
         
     

