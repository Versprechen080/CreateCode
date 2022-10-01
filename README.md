### 随机生成密码
设置密码位数那有些小bug，原本想用 int num=Integer.parseInt(code.getText())来设定密码位数，但总有 "_ISSetPhysicalKeyboardCapsLockLED Inhibit"的报错(
所以直接默认设置位数为8了，位数的值可以直接在代码里改 

String ffcode=createCode(8);  把8换成任意数字就行。
