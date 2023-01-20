// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan20",
    products: [
        .library(
            name: "mpJan20",
            targets: ["mpJan20"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan20",
            dependencies: []),
        .testTarget(
            name: "mpJan20Tests",
            dependencies: ["mpJan20"]),
    ]
)
