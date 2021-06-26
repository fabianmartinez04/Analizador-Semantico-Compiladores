SECTION .data ; data section 
	 x: dd 	0 
SECTION .text ; code section 
 	 global _start ; entry point 
_start: 
final: 
	 mov 	 ebx,0 
	 mov 	 eax,1 
	 int 	 0x80