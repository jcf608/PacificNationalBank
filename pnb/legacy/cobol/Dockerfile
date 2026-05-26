FROM ubuntu:22.04
RUN apt-get update && apt-get install -y gnucobol && rm -rf /var/lib/apt/lists/*
WORKDIR /pnb
COPY . .
RUN make all || true
CMD ["bash", "-c", "echo PNB COBOL batch container ready"]
