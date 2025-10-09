## アプリのビルド
```bash
mvn clean package -DskipTests
```
## コンテナイメージのビルド
```bash
docker build -t k8s-sample-app:latest .
```

## コンテナイメージのタグ付け
```bash
docker tag k8s-sample-app:latest nkdeveloper26/k8s-sample-app:latest .
```

## コンテナイメージを Docker Hub に push
```bash
docker push nkdeveloper26/k8s-sample-app:latest
```

## マニフェスト適用
```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```
