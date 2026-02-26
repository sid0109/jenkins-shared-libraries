def call(String url, String branch){
  echo "code cloning..."
  git url: "${url}",  branch:"${branch}"
  echo "code clone successfull!!"
}
