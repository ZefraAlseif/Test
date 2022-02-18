%% Flipping Coins from head to tails and count the number of coins that are tails (https://www.codechef.com/problems/FLIPCOIN)
prompt = 'How many coins are available in total: ';
coins = input(prompt);
prompt = 'How many different operations would you like to perform: ';
actions = input(prompt);
C = zeros(1,coins);
prompt = 'Input the data (digits) in the format [1 A B 0 A B 1 A B . . .] (If the digits dont total 3*actions then information will be missing: ';
X = input(prompt);
count = 0;
heads = 0;
for i=0:actions-1
    if (X(1,(i*3)+1) ~=0)
        for j=(i*3)+2:(i*3)+3
            if (C(1,j) == 1)
                heads = heads +1 ;
            end
        end
        disp(heads);
        heads = 0;
    else
        for j=(i*3)+2:(i*3)+3
            if (C(1,j) == 0)
                C(1,j) = 1;
            else
                C(1,j) = 0;
            end
        end
    end
end
