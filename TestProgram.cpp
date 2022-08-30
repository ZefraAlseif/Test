#include <iostream>
#include <cmath>
/*
using namespace std;

int main()
{
    char grade = 'A';
    string phrase = "Giraffe Academy";
    int age = 50;
    double gpa = 2.3;
    bool isMale = false;

    cout << phrase;

    return 0;
}

*/ // Tutorial

/* String Tutorial
using namespace std;

int main()
{
    string phrase = "Giraffe Academy";
    cout << phrase.length() << endl ;
    cout << phrase.substr(8,3) << endl;
    string phrasesub;
    phrasesub = phrase.substr(8,3);
    cout << phrasesub << endl;

    return 0;
}
*/

/* Tutorial Numbers
using namespace std;

int main()
{
    int wnum = 5;
    double dnum = 5.5;
    wnum++;
    cout << 10.0 / 3.0 << endl;
    cout << 5.5 + 9 << endl;
    cout << pow(2,5) << endl;
    cout << round(dnum) << endl;
    cout << sqrt(32) << endl;
    cout << ceil(4.1) << endl;
    cout << fmax(3,10) << endl;
    cout << fmin(3,10) << endl;


    return 0;
}

*/

/* User input tutorial
using namespace std;

int main()
{
    // For some reason c++ does not allow for different kinds of scans i.e cin and getline()
    string age;
    cout << "Enter your age: ";
    getline(cin,age);

    cout << "You are " << age << " years old" << endl ;
    

    string name;
    cout << "Enter your full name: ";
    getline(cin,name);
    cout << "Hello " << name << endl;
    return 0;
}
*/

/* Tutorial Basic Calculator
using namespace std;

int main()
{

    double x;
    double y;

    cout << "Input first value: ";
    cin >> x  ;  
    cout << "Input second value: ";
    cin >> y ;

    cout << "The result is: " << x + y << endl;
    return 0;
}
*/

/* Tutorial Mad Libs
using namespace std;

int main()
{
    string color, pluralNoun, celebrity;

    cout << "Enter a color: ";
    getline(cin, color);
    cout << "Enter a plural noun: ";
    getline(cin,pluralNoun);
    cout << "Enter a celebrity: ";
    getline(cin,celebrity);

    cout << "Roses are "<< color << endl;
    cout << pluralNoun << " are blue" << endl;
    cout << "I love "<< celebrity << endl;
    
    return 0;
}
*/ 

using namespace std;

int main()
{

    int luckyNums[20] ;


    
    luckyNums[0] = 100;
    cout << luckyNums[0] << "\n";

    return 0;
}