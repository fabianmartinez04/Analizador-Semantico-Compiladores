SECTION .data ; data section 
	 b: dd 	65 
	 a: dd 	0 
SECTION .text ; code section 
 	 global _start ; entry point 
_start: 
	mov 	 rax,b
	mov 	 rcx,5
	mul 	rcx
	mov 	[a],rax
final: 
	 mov 	 ebx,0 
	 mov 	 eax,1 
	 int 	 0x80