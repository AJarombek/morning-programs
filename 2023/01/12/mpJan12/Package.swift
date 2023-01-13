// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan12",
    products: [
        .library(
            name: "mpJan12",
            targets: ["mpJan12"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan12",
            dependencies: []),
        .testTarget(
            name: "mpJan12Tests",
            dependencies: ["mpJan12"]),
    ]
)
