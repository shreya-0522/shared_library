package org.mygurukulam.common

def call(String url, String creds, String branch) {
            echo "Cloning repo ${url} from branch ${branch} using creds ${creds}";
            git branch: "${branch}", credentialsId: "${creds}", url: "${url}"
    }