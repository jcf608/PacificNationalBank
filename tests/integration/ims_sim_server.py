import socket

HOST = "0.0.0.0"
PORT = 9999


def main() -> None:
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server:
        server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        server.bind((HOST, PORT))
        server.listen(20)
        while True:
            conn, _ = server.accept()
            with conn:
                data = conn.recv(4096)
                if not data:
                    continue
                conn.sendall(b"PNB-IMS-SIM-ACK:" + data[:128])


if __name__ == "__main__":
    main()
