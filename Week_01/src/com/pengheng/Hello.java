package com.pengheng;

/**
 * @project JAVA-000
 * @remark
 * @Author Administrator
 * @date 2020/10/16
 */
public class Hello {
    public void hello() {
        //基本类型
        byte _byte = 1;
        short _short = 2;
        int _int = 3;
        long _long = 4L;
        float _float = 5f;
        double _double = 6D;
        int[] _intArray = new int[]{100, 200, 300};
        //四则运算
        int _add = _intArray[0] + _intArray[1];
        int _sub = _intArray[0] - _intArray[1];
        int _multil = _intArray[0] * _intArray[1];
        int _devided = _intArray[0] / _intArray[1];
        double _devided2 = _intArray[0] * _intArray[1];

        //if
        if (_intArray.length > 10) {
            System.out.println("size > 10");
        }
        //for
        for (int i = 10; i < _int; i--) {
            System.out.println(i);
        }
        for (int i : _intArray) {
            System.out.println(i);
        }

    }
}
// 字节码分析
//"C:\Program Files\Java\jdk1.8.0_131\bin\javap.exe" -v com.pengheng.Hello
//        Classfile /E:/WorkSpaces/JAVA-000/out/production/Week_01/com/pengheng/Hello.class
//Last modified 2020-10-16; size 1112 bytes
//        MD5 checksum d7b90ce258e37e6bcb00a25e7acd625c
//        Compiled from "Hello.java"
//public class com.pengheng.Hello
//        minor version: 0
//        major version: 52
//        flags: ACC_PUBLIC, ACC_SUPER
//        Constant pool:
//          #1 = Methodref          #12.#45        // java/lang/Object."<init>":()V
//          #2 = Long               4l
//          #4 = Float              5.0f
//          #5 = Double             6.0d
//          #7 = Fieldref           #46.#47        // java/lang/System.out:Ljava/io/PrintStream;
//          #8 = String             #48            // size > 10
//          #9 = Methodref          #49.#50        // java/io/PrintStream.println:(Ljava/lang/String;)V
//          #10 = Methodref          #49.#51        // java/io/PrintStream.println:(I)V
//          #11 = Class              #52            // com/pengheng/Hello
//          #12 = Class              #53            // java/lang/Object
//          #13 = Utf8               <init>
//          #14 = Utf8               ()V
//          #15 = Utf8               Code
//          #16 = Utf8               LineNumberTable
//          #17 = Utf8               LocalVariableTable
//          #18 = Utf8               this
//          #19 = Utf8               Lcom/pengheng/Hello;
//          #20 = Utf8               hello
//          #21 = Utf8               i
//          #22 = Utf8               I
//          #23 = Utf8               _byte
//          #24 = Utf8               B
//          #25 = Utf8               _short
//          #26 = Utf8               S
//          #27 = Utf8               _int
//          #28 = Utf8               _long
//          #29 = Utf8               J
//          #30 = Utf8               _float
//          #31 = Utf8               F
//          #32 = Utf8               _double
//          #33 = Utf8               D
//          #34 = Utf8               _intArray
//          #35 = Utf8               [I
//          #36 = Utf8               _add
//          #37 = Utf8               _sub
//          #38 = Utf8               _multil
//          #39 = Utf8               _devided
//          #40 = Utf8               StackMapTable
//          #41 = Class              #52            // com/pengheng/Hello
//          #42 = Class              #35            // "[I"
//          #43 = Utf8               SourceFile
//          #44 = Utf8               Hello.java
//          #45 = NameAndType        #13:#14        // "<init>":()V
//          #46 = Class              #54            // java/lang/System
//          #47 = NameAndType        #55:#56        // out:Ljava/io/PrintStream;
//          #48 = Utf8               size > 10
//          #49 = Class              #57            // java/io/PrintStream
//          #50 = NameAndType        #58:#59        // println:(Ljava/lang/String;)V
//          #51 = NameAndType        #58:#60        // println:(I)V
//          #52 = Utf8               com/pengheng/Hello
//          #53 = Utf8               java/lang/Object
//          #54 = Utf8               java/lang/System
//          #55 = Utf8               out
//          #56 = Utf8               Ljava/io/PrintStream;
//          #57 = Utf8               java/io/PrintStream
//          #58 = Utf8               println
//          #59 = Utf8               (Ljava/lang/String;)V
//          #60 = Utf8               (I)V
//          {
//public com.pengheng.Hello();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=1, locals=1, args_size=1
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//        LineNumberTable:
//        line 9: 0
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       5     0  this   Lcom/pengheng/Hello;
//
//public void hello();
//          方法返回类型 void
//        descriptor: ()V
//          公共访问方法
//        flags: ACC_PUBLIC
//        Code:
//            stack = 栈深 locals = 本地变量表数量 args_size 方法参数 args_size（非静态方法 args_size 会默认包含一个this的参数） ACC_STATIC 无参方法的 args_size = 0
//        stack=4, locals=18, args_size=1
//        定义一个int类型的1 压入到栈中  定义的类型是 byte
//        0: iconst_1
//        将栈顶int类型的数据存到本地变量表1号槽中
//        1: istore_1
//        定义一个int类型的2 压入到栈中  定义的类型是 short
//        2: iconst_2
//        将栈顶int类型的数据存到本地变量表2号槽中
//        3: istore_2
//        定义一个int类型的3 压入到栈中  定义的类型是 int
//        4: iconst_3
//        将栈顶int类型的数据存到本地变量表3号槽中
//        5: istore_3
//        从常量池中加载#2 2号 Long 对象并压入栈顶  定义的类型是 Long
//        6: ldc2_w        #2                  // long 4l
//        将栈顶Long类型的数据存到本地变量表4号槽中
//        9: lstore        4
//        从常量池中加载#4 4号 float 对象并压入栈顶  定义的类型是 float
//        11: ldc           #4                  // float 5.0f
//        将栈顶float类型的数据存到本地变量表6号槽中  为什么是6号槽不是5号？ 因为 Long类型的对象会占2个槽口
//        13: fstore        6
//        从常量池中加载#5 5号 double 对象并压入栈顶  定义的类型是 double
//        15: ldc2_w        #5                  // double 6.0d
//        将栈顶double类型的数据存到本地变量表7号槽中
//        18: dstore        7

//          定义数组开始  ================================================================
//        java 源码 int[] _intArray = new int[]{100, 200};

//        定义int值 2 压入栈顶
//        20: iconst_2

//        创建一个指定类型为int的数组 并压入到栈顶
//        21: newarray       int

//        复制栈顶值，
//        23: dup

//        顶一个一个值 0 压入栈顶
//        24: iconst_0

//        定义一个 100 压入栈顶
//        25: bipush        100

//        将栈顶int型数值存入指定数组的指定索引位置
//        27: iastore

//        复制栈顶值，并压入栈顶
//        28: dup

//        定义一个int值为1的数据 并压入栈顶
//        29: iconst_1

//        定义一个small int 为200的数 并压入栈顶
//        30: sipush        200

//        将栈顶int型数值存入指定数组的指定索引位置
//        33: iastore

//        将数组存在9号槽中
//        34: astore        9
//          定义数组结束  ================================================================
//        36: aload         9
//        38: iconst_0
//        39: iaload
//        40: aload         9
//        42: iconst_1
//        43: iaload
//        44: iadd
//        45: istore        10
//        47: aload         9
//        49: iconst_0
//        50: iaload
//        51: aload         9
//        53: iconst_1
//        54: iaload
//        55: isub
//        56: istore        11
//        58: aload         9
//        60: iconst_0
//        61: iaload
//        62: aload         9
//        64: iconst_1
//        65: iaload
//        66: imul
//        67: istore        12
//        69: aload         9
//        71: iconst_0
//        72: iaload
//        73: aload         9
//        75: iconst_1
//        76: iaload
//        77: idiv
//        78: istore        13
//        80: aload         9
//        82: arraylength
//        83: bipush        10
//        85: if_icmple     96
//        88: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        91: ldc           #8                  // String size > 10
//        93: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        96: bipush        10
//        98: istore        14
//        100: iload         14
//        102: iload_3
//        103: if_icmpge     120
//        106: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        109: iload         14
//        111: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
//        114: iinc          14, -1
//        117: goto          100
//        120: aload         9
//        122: astore        14
//        124: aload         14
//        126: arraylength
//        127: istore        15
//        129: iconst_0
//        130: istore        16
//        132: iload         16
//        134: iload         15
//        136: if_icmpge     160
//        139: aload         14
//        141: iload         16
//        143: iaload
//        144: istore        17
//        146: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        149: iload         17
//        151: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
//        154: iinc          16, 1
//        157: goto          132
//        160: return
//        LineNumberTable:
//        line 12: 0
//        line 13: 2
//        line 14: 4
//        line 15: 6
//        line 16: 11
//        line 17: 15
//        line 18: 20
//        line 20: 36
//        line 21: 47
//        line 22: 58
//        line 23: 69
//        line 26: 80
//        line 27: 88
//        line 30: 96
//        line 31: 106
//        line 30: 114
//        line 33: 120
//        line 34: 146
//        line 33: 154
//        line 37: 160
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        100      20    14     i   I
//        146       8    17     i   I
//        0     161     0  this   Lcom/pengheng/Hello;
//        2     159     1 _byte   B
//        4     157     2 _short   S
//        6     155     3  _int   I
//        11     150     4 _long   J
//        15     146     6 _float   F
//        20     141     7 _double   D
//        36     125     9 _intArray   [I
//        47     114    10  _add   I
//        58     103    11  _sub   I
//        69      92    12 _multil   I
//        80      81    13 _devided   I
//        StackMapTable: number_of_entries = 5
//        frame_type = 255 /* full_frame */
//        offset_delta = 96
//        locals = [ class com/pengheng/Hello, int, int, int, long, float, double, class "[I", int, int, int, int ]
//        stack = []
//        frame_type = 252 /* append */
//        offset_delta = 3
//        locals = [ int ]
//        frame_type = 250 /* chop */
//        offset_delta = 19
//        frame_type = 254 /* append */
//        offset_delta = 11
//        locals = [ class "[I", int, int ]
//        frame_type = 248 /* chop */
//        offset_delta = 27
//        }
//        SourceFile: "Hello.java"
//
//        Process finished with exit code 0
