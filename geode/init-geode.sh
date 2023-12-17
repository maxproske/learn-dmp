#!/bin/bash

echo "Waiting for geode-locator to become available..."
while ! nc -z geode-locator 10334; do   
  sleep 1
done

echo "Locator is up and running."

# Connect to the Geode cluster and create the Locations region
gfsh -e "connect --locator=geode-locator[10334]" \
    -e "create region --name=Locations --type=REPLICATE"
