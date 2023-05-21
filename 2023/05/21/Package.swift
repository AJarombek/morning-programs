// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mp",
    products: [
        .library(
            name: "mp",
            targets: ["mp"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mp",
            dependencies: []),
        .testTarget(
            name: "mpTests",
            dependencies: ["mp"]),
    ]
)
