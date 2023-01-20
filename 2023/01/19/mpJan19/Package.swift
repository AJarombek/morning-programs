// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan19",
    products: [
        .library(
            name: "mpJan19",
            targets: ["mpJan19"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan19",
            dependencies: []),
        .testTarget(
            name: "mpJan19Tests",
            dependencies: ["mpJan19"]),
    ]
)
