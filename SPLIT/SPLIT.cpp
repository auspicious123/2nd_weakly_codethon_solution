#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int ldigit=(n%10)%2;
        n=n/10;
        int f=0;
        while(n>0){
            if((n%10)%2==ldigit){
                cout<<"YES"<<endl;
                f=1;
                break;
            }
            n=n/10;
        }
        if(f==0){
            cout<<"NO"<<endl;
        }
    }
    return 0;
}