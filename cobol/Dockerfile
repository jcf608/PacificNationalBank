FROM ubuntu:22.04

RUN apt-get update && apt-get install -y \
    gnucobol \
    libcob4 \
    make \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /app
COPY . /app/
RUN make all

CMD ["./run_batch.sh"]
