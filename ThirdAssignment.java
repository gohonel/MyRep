����   4 G  Assignements/ThirdAssignment  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LAssignements/ThirdAssignment; test (I)I t I i k array [I StackMapTable  main ([Ljava/lang/String;)V
    	    java/lang/System   ! out Ljava/io/PrintStream; # java/lang/StringBuilder % Largest Palindrome is: 
 " '  ( (Ljava/lang/String;)V
 " * + , append (I)Ljava/lang/StringBuilder;
 " . / 0 toString ()Ljava/lang/String;
 2 4 3 java/io/PrintStream 5 ( print 7 , made by the numbers  9  and 
 " ; + < -(Ljava/lang/String;)Ljava/lang/StringBuilder; args [Ljava/lang/String; j max maxi maxj prod > 
SourceFile ThirdAssignment.java !               /     *� �    
                    	       �     K�
N<� -
pO
l;����-.� =� =<� -.-dd.� ������    
   :      
 
     
   %  '  *  -  2  ?  A  I     4    K      D    '     -      F       ! � 
     �      	      5     =>66d<� 3d=� #h6� � � >66���܄��̲ � "Y$� &� )� -� 1� � "Y6� &� )8� :� )� -� 1�    
   6    $ 
 '  )  +  , * . - / 0 0 3 ) = ' G 5 ] 6 ~ 8    H     = >    r     } ?    { @    x A   
 u B     C       �   D  � � 	  E    F