#include <iostream>

using namespace std; // Ư�� ��Ī�����̳� ��Ī���� ���� Ư�� �̸��� ���� ����ϴ� ��� ��Ī���� ���� ����ȭ ����

namespace NameSpace1 { // ��Ī ������ �̸� : NameSpace1
	int d = 10; // ��Ī�� �����ϴ� ���� ����
}
namespace NameSpace2 {
	int d = 20;
}
int d = 30;
namespace NameSpace1 {
	int e = 50;
}

int main() // �Ӹ���
{ // ��ü ���
	std::cout << "���� ù��° c++ ���α׷�" << std::endl; // ǥ�� ��� ��Ʈ������ ������ �����

	/* a�� b�� �� �߿���
	 �� ū ���� ����Ѵ�. */
	int a = 10;
	int b = 50;
	if (a > b) {
		std::cout << a << std::endl;
	}
	else {
		std::cout << b << std::endl;
	}

	std::cin >> a; 	// ǥ�� �Է� ��Ʈ��
	int aSquare = a * a;
	std::cout << "�Է°� a * a = " << aSquare << std::endl;

	/*
		a�� b���� ���� ���
		a�� b �� ��ȯ�Ѵ�. */

	if (a < b) {
		auto tmp = a;
		a = b;
		b = tmp;
	}
	std::cout << "a = " << a << std::endl;
	std::cout << "b = " << b << std::endl;

	int c;
	char str[100];
	std::cin >> c >> str;
	std::cout << c << str << std::endl;

	/* ��Ī ����
	   ���� ��� */
	int d = 40;
	std::cout << NameSpace1::d << std::endl; // ��Ī���� �ܺο����� �Ҽ� ��Ī���� ������ ���
	std::cout << NameSpace2::d << std::endl;
	std::cout << ::d << std::endl;
	std::cout << d << std::endl;
	std::cout << NameSpace1::e << std::endl;

	cout << "Hello C world!" // using �̿��� std ��Ī���� ����ȭ ���
		<< endl;
	return 0;
}