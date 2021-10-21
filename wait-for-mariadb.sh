#!/bin/sh

>&2 echo "Check DB!"
while ! mysqladmin ping -h db -umedisoftuser --password=medisoft987; do
    >&2 echo "Wait ..."
    sleep 10
done
>&2 echo "DB ready!"

/bin/sleep 0xffffffff