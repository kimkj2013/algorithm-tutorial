global  main
extern printf, scanf

section .data
	fmtScanf: db "%s",0
	fmtPrintf: db "Your value: %s",0
	argv: db 0
	result: db 0

section .bss
	input: resb 10000

section .text
main:
	push input
	push fmtScanf
	call scanf
	add esp, 8

exit:
	push input
	push fmtPrintf
	call printf
	add esp, 8

	ret
