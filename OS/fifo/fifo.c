#include <stdio.h>
#include <sys/stat.h>
#include <sys/types.h>
int main() {
    int res;
    res = mkfifo("fifo", 0777);
    printf("named pipe created\n");
}